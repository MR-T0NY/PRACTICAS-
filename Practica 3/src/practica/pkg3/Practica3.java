/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author banda
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora casio = new Calculadora();
        casio.Encender();
        System.out.println(casio.suma(7, 10));
        System.out.println(casio.resta(25, 20));
        System.out.println(casio.Mult(4, 10));
        System.out.println(casio.division(10, 2));
        
        Calculadora_Cient Casio= new Calculadora_Cient();
        System.out.println(Casio.Elevado());
        casio.Apagar();
        
        Telefono motorola = new Telefono("carga");
        motorola.Encender();
        System.out.println(motorola.Mult(5, 6));
        System.out.println(motorola.suma(5, 6));
        System.out.println(motorola.resta(5, 6));
        System.out.println(motorola.division(5, 6));
        System.out.println(motorola.Hacerllamadas());
        System.out.println(motorola.TerminarLlama());
        motorola.Apagar();
        
        
        
    }
    
    
}
