
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;


public class VistaElectrodomestico {
    private Scanner leer;
    
    public  Lavadora ingresarLavadora(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese codigo");
        int codigo = leer.nextInt();
        System.out.println("Ingrese descripcion");
        String descripcion= leer.next();
        System.out.println("Ingrese precioBase");
        double precio=leer.nextDouble();
        System.out.println("Ingrese color");
        String color=leer.next();
        System.out.println("ingrese consumoEnergetico");
        String ce=leer.next();
        char cE= ce.charAt(0);
        System.out.println("Ingrese peso");
        int peso=leer.nextInt();
         System.out.println("Ingrese carga");
         int carga=leer.nextInt();
         
        return new Lavadora (codigo,descripcion,precio,color,cE,peso,carga);
    
    }
    public Television ingresarTelevision(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese codigo");
        int codigo = leer.nextInt();
        System.out.println("Ingrese descripcion");
        String descripcion= leer.next();
        System.out.println("Ingrese precioBase");
        double precio=leer.nextDouble();
        System.out.println("Ingrese color");
        String color=leer.next();
        System.out.println("ingrese consumoEnergetico");
        String ce=leer.next();
        char cE= ce.charAt(0);
        System.out.println("Ingrese peso");
        int peso=leer.nextInt();
        System.out.println("Ingrese resolucion");
        int res=leer.nextInt();
        System.out.println("Tiene puerto HDMI si/no" );
        String resp=leer.next();
        boolean hdmi;
        
        if (resp.equalsIgnoreCase("si")){
           hdmi=true; 
        }else{
            hdmi=false;
        }
        
        return new Television (res,hdmi,codigo,descripcion,precio,color,cE,peso);
        
        }
     public void mostrarLavadoras(List <Lavadora> lavadoras){
        System.out.println("Listado de las Lavadoras");
        for(Lavadora lavadora: lavadoras){
            System.out.println("Lavadora: "+lavadora);
        }
    }
    public void mostrarTelevisiones(List <Television> televisiones){
        System.out.println("Listado de las Televisiones");
        for(Television television: televisiones){
            System.out.println("Television: "+television);
        }
    }
}
