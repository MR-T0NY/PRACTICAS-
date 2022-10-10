/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_8;
import static practica_8.UTIL.*;

/**
 *
 * @author banda
 */
public class PRACTICA_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrearArchivo("ARCHIVO\\HOLA.txt");
        CrearArchivo("C:\\JAVA_ARCHIVOS\\HOLA.txt");/*Esta parte es para cuando queremos que el archivo este en el disco duro de nuestra computadora*/
      
        EscribirArchivo("ARCHIVO\\HOLA.txt", "Hola a todos, espero que este trabajo este bien");
        EscribirArchivo("ARCHIVO\\HOLA.txt", "Hello there");
        EscribirArchivo("ARCHIVO\\HOLA.txt", "GENERAL Kenobi");
         
         EscribirArchivo("C:\\JAVA_ARCHIVOS\\HOLA.txt", "Hello there");
         EscribirArchivo("C:\\JAVA_ARCHIVOS\\HOLA.txt", "GENERAL Kenobi");
         
         System.out.println("\n------ARCHIVO EN EL PROYECTO------");
         LeerArchivo("ARCHIVO\\HOLA.txt");
         
         System.out.println("\n-----ARCHIVO EN EL DISCO DURO");
         LeerArchivo("C:\\JAVA_ARCHIVOS\\HOLA.txt");
    }
    
}
