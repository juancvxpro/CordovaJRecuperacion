/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Juanc
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {
    
    private SortedSet <Electrodomestico> lista;
    private List<Television> listaTelevision;
    private List<Lavadora> listaLavadora;
    
      public ElectrodomesticoDAO() {
        lista = new TreeSet<Electrodomestico>();
        listaTelevision = new ArrayList<>();
        listaLavadora = new ArrayList<>();
    }
     
    @Override
    public void crearTelevision(Television television) {
       lista.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
      lista.add(lavadora);
    }

    @Override
    
    public List<Television> listarTelevision() {
        Iterator<Electrodomestico> iteraciones = lista.iterator();
        while(iteraciones.hasNext()){
        Electrodomestico eD=  iteraciones.next();
        if (eD instanceof Television){
        Television  television= (Television) eD;
        listaTelevision.add(television);
        }
        }
       
        
        return listaTelevision;
        
    }

    @Override
    public List<Lavadora> listarLavadora() {
       Iterator<Electrodomestico> iteraciones = lista.iterator();
        while(iteraciones.hasNext()) {
        Electrodomestico eD=  iteraciones.next();
        if (eD instanceof Lavadora){
        Lavadora  lavadora= (Lavadora) eD;
        listaLavadora.add(lavadora);
        }
        }
       
       
        return listaLavadora;
    }
    
}
