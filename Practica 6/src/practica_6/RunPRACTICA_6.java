/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_6;
import java.util.ArrayList;
import practica_6.COMP_ELECTR;

/**
 *
 * @author banda
 */
public class RunPRACTICA_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Telefono Tl = new Telefono();
       Computadora Comp = new Computadora();
       
       ArrayList<Computadora> COMPUTADORAS = new ArrayList<Computadora>();
       COMPUTADORAS.add(Comp);
       
          Comp.setColor("Gris");
          Comp.setModelo("G15");      
          Comp.setMarca("DELL");         
          Comp.setAño("2018");          
          Comp.setSO("WINDOWS");

       for (COMP_ELECTR o : COMPUTADORAS ){
            System.out.println("-----------COMPUTADORA--------");
            System.out.println("Marca:"+o.getMarca());
            System.out.println("Modelo:"+o.getModelo());
            System.out.println("Color:"+o.getColor());
            System.out.println("Anio:"+o.getAño());
            System.out.println("Sistema Operativo:"+o.getSO());
    }
    
        ArrayList<Telefono> Telefonos = new ArrayList<Telefono>();
        Telefonos.add(Tl);
        
          Tl.setColor("Rojo");
          Tl.setModelo("Galaxy A20S");
          Tl.setMarca("Samsung");
          Tl.setAño("2016");
          Tl.setSO("ANDROID");
          
          for (COMP_ELECTR o : Telefonos ){
            System.out.println("\n-----------TELEFONO--------");
            System.out.println("Marca:"+o.getMarca());
            System.out.println("Modelo:"+o.getModelo());
            System.out.println("Color:"+o.getColor());
            System.out.println("Anio:"+o.getAño());
            System.out.println("Sistema Operativo:"+o.getSO());
    }
          
          
}
}