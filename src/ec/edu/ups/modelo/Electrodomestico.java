
package ec.edu.ups.modelo;


public class Electrodomestico implements Comparable <Electrodomestico>{
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }
    
    public Electrodomestico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
 
    
    
    public double obtenerPrecioFinal(){
    double precio=0.0;
      int peso=getPeso();
        char cE=getConsumoEnergetico();
        if(cE=='A'){
        precio=100;
        }
        if(cE=='B'){
        precio=80;
        }
        if(cE=='C'){
        precio=60;
        }
        if(cE=='D'){
        precio=50;
        }
        if(cE=='E'){
        precio=30;
        }
        if(cE=='F'){
        precio=10;
        }
        
        if(peso>=0&&peso<=19){
        precio=precio+10;
        }else if(peso>=20&&peso<=49){
        precio=precio+50;
        }else if(peso>80){
        precio=precio+100;
        }
        
        
        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    @Override
    public int compareTo(Electrodomestico e) {
       return (int) (this.precioBase-e.precioBase);
       
    }
    
            
}
