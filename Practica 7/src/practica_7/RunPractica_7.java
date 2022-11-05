/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_7;
import java.util.ArrayList;


/**
 *
 * @author banda
 */
public class RunPractica_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cocodrilo cocodr = new Cocodrilo();
        Gato gat = new Gato();
        Gorrion Gorr = new Gorrion();
        Jaguar Jag = new Jaguar();
        Perro Perr = new Perro();
        
        ArrayList<Cocodrilo> COCODRILO = new ArrayList<Cocodrilo>();
       COCODRILO.add(cocodr);
       
          cocodr.setEdad("27 anios");
          cocodr.setNombre("Root");      
          cocodr.setRaza("Cocodrilo blanco");         
          cocodr.setComer("Acaba de comer"); 
          
          for (Animal o : COCODRILO ){
            System.out.println("-----------COCODRILO--------");
            System.out.println("Edad:"+o.getEdad());
            System.out.println("Nombre:"+o.getNombre());
            System.out.println("Raza:"+o.getRaza());
            System.out.println("Comer:"+o.getComer());
            
             ArrayList<Gato> GATO = new ArrayList<Gato>();
          GATO.add(gat);
       
          gat.setEdad("1 anio");
          gat.setNombre("Bigotes");      
          gat.setRaza("Bengala");         
          gat.setComer("Acaba de comer"); 
          
          for (Animal a : GATO ){
            System.out.println("\n-----------GATO--------");
            System.out.println("Edad:"+a.getEdad());
            System.out.println("Nombre:"+a.getNombre());
            System.out.println("Raza:"+a.getRaza());
            System.out.println("Comer:"+a.getComer());
            
            ArrayList<Gorrion> GORR = new ArrayList<Gorrion>();
          GORR.add(Gorr);
       
          gat.setEdad("1 mes");
          gat.setNombre("CYON");      
          gat.setRaza("Gorriom");         
          gat.setComer("Ya comio"); 
          
          for (Animal e : GORR ){
            System.out.println("\n-----------GORRION--------");
            System.out.println("Edad:"+e.getEdad());
            System.out.println("Nombre:"+e.getNombre());
            System.out.println("Raza:"+e.getRaza());
            System.out.println("Comer:"+e.getComer());
            
            ArrayList<Jaguar> jag = new ArrayList<Jaguar>();
          jag.add(Jag);
       
          Jag.setEdad("2 mes");
          Jag.setNombre("Blu");      
          Jag.setRaza("Jaguar");         
          Jag.setComer("Ya comio"); 
          
          for (Animal i : jag ){
            System.out.println("\n-----------JAGUAR--------");
            System.out.println("Edad:"+i.getEdad());
            System.out.println("Nombre:"+i.getNombre());
            System.out.println("Raza:"+i.getRaza());
            System.out.println("Comer:"+i.getComer());
            
            ArrayList<Perro> pe = new ArrayList<Perro>();
          pe.add(Perr);
       
          Perr.setEdad("2 mes");
          Perr.setNombre("Manchas");      
          Perr.setRaza("Pitbull");         
          Perr.setComer("Ya comio"); 
          
          for (Animal m : jag ){
            System.out.println("\n-----------PERRO--------");
            System.out.println("Edad:"+m.getEdad());
            System.out.println("Nombre:"+m.getNombre());
            System.out.println("Raza:"+m.getRaza());
            System.out.println("Comer:"+m.getComer());
          
          
    }
    
}
}
}
}
}
}