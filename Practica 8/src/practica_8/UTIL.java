/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8;
import java.io.*;
/**
 *
 * @author banda
 */
public class UTIL {
    public static void CrearArchivo(String NombreArchivo){
        File archivo = new File(NombreArchivo);
        
        try {
           PrintWriter salida = new PrintWriter(archivo);
           salida.close();
           System.out.println("Archivo creado de forma exitosa");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
        
    public static void EscribirArchivo(String NombreArchivo, String Contenido){
        File archivo = new File(NombreArchivo);
        
        try{
           PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
           salida.println(Contenido);
           salida.close();
           System.out.println("Se escribio en el archivo");
        }catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void LeerArchivo(String NombreArchivo){
        File archivo = new File(NombreArchivo);
        
        try{
           BufferedReader entrada = new BufferedReader(new FileReader(archivo));
           String Lectura = entrada.readLine();
           while(Lectura != null){
            System.out.println(Lectura);
            Lectura = entrada.readLine();
        } 
           entrada.close();
        }catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
}
