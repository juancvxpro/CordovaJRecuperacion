/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.controladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author Juanc
 */
public class Prueba {

    public static void main(String[] args) {
        Electrodomestico eD = new Electrodomestico();
        VistaElectrodomestico vistaE = new VistaElectrodomestico();
        ElectrodomesticoDAO Edao = new ElectrodomesticoDAO();

        controladorElectrodomestico ctrl = new controladorElectrodomestico(vistaE, Edao);
        System.out.println("Ingreso de lavadoras");
        ctrl.registrarLavadora();
        ctrl.registrarLavadora();
        ctrl.registrarLavadora();

        System.out.println("Ingreso de televisiones");
        ctrl.registrarTelevision();
        ctrl.registrarTelevision();
        ctrl.registrarTelevision();
        
        System.out.println("Listado de las lavadoras");
        ctrl.verLavadoras();

        System.out.println("lListado de las televisiones");
        ctrl.verTelevisores();
    }
}
