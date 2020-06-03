/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Juanc
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
    }

   

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public double obtenerPrecioFinal() {
       
         double pF = super.obtenerPrecioFinal();
        double pB = super.getPrecioBase();
        double precio = pF + pB;
        if (super.getPeso() > 30) {
            precio=precio+ 50;
        }
        
        return precio;
       
       
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString()+"carga=" + carga +" PrecioFinal" +this.obtenerPrecioFinal()+'}';
    }
    
    
}
