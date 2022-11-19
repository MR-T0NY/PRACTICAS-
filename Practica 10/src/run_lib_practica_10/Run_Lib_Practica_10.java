/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package run_lib_practica_10;
import Lib.Calculadora;
/**
 *
 * @author banda
 */
public class Run_Lib_Practica_10{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora casio = new Calculadora();
       
       System.out.println(casio.suma(20, 12));
       System.out.println(casio.resta(30, 44));
       System.out.println(casio.div(84, 2));
       System.out.println(casio.mult(12, 5));
    }
    
}
