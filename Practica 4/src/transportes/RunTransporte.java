/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportes;

/**
 *
 * @author banda
 */
public class RunTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n------AUTOMOVIL------");
        Automovil BMW = new Automovil(20);
        Automovil Ford = new Automovil((double) 26);
        
        System.out.println("\n------AVION------");
        Avion Mex = new Avion(1);
        Avion USA = new Avion (75);
        
        System.out.println("\n-------TRENES---------");
        Trenes vapor = new Trenes(80);
        Trenes bala = new Trenes((double)40);
    }
    
}
