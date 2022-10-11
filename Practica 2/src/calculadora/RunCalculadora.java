/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author banda
 */
public class RunCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Calculadora casio = new Calculadora();
       System.out.println(casio.resta(5, 4));
       System.out.println(casio.suma(6, 14));
       System.out.println(casio.division(36, 2));
       System.out.println(casio.mult(9, 8));
       
       Calculadora_cientifica Maboto = new Calculadora_cientifica();
       System.out.println(Maboto.Elevado(9));
       System.out.println(Maboto.Raiz(36));
    }
}
    
