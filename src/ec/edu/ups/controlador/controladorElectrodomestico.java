package ec.edu.ups.controlador;

import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

public class controladorElectrodomestico {

    private VistaElectrodomestico vE;

    private Electrodomestico eD;

    private IElectrodomesticoDAO EDao;

    public controladorElectrodomestico(VistaElectrodomestico vE, IElectrodomesticoDAO EDao) {
        this.vE = vE;
        this.EDao = EDao;
    }

    public void registrarLavadora() {
        eD = vE.ingresarLavadora();
        EDao.crearLavadora((Lavadora) eD);
    }

    public void registrarTelevision() {
        eD = vE.ingresarTelevision();
        EDao.crearTelevision((Television) eD);
    }

    public void verLavadoras() {
        List<Lavadora> lavadoras;
        lavadoras = EDao.listarLavadora();
        vE.mostrarLavadoras(lavadoras);

    }

    public void verTelevisores() {

        List<Television> televisiones;
        televisiones = EDao.listarTelevision();
        vE.mostrarTelevisiones(televisiones);
    }
}
