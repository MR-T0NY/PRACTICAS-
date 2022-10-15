/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

import vehiculos.Vehiculo;

/**
 *
 * @author banda
 */
public class Automovil extends Vehiculo{
    
    public Automovil(){
        
    }
    public Automovil(int Gas){
        this.encenderAutomovil(Gas);
        this.avanzarAutomovil(Gas);
    }
    
    public Automovil(double carga){
        this.encenderAutomovil(carga);
        this.avanzarAutomovil(carga);
    } 
    private void encenderAutomovil(int Gas){
        if(Gas > 1){
            System.out.println("El vehiculo esta encendido");
            }else{
            System.out.println("El vehiculo no tiene suficiente gasolina");
        }
    }
    private void avanzarAutomovil(int Gas){
        if (Gas>1 && Gas<10){
            System.out.println("El vehiculo le queda poca gasolina");
        }else{
            System.out.println("El vehiculo puede avanzar");
        }
        }
    private void encenderAutomovil(double carga){
        if(carga > 75){
            System.out.println("El vehiculo puede encender sin problemas");
        }else{
            System.out.println("El vehiculo necesita un cambio de carga");
        }
    }
    private void avanzarAutomovil(double carga){
        if(carga>12 && carga<20){
        System.out.println("El vehiculo no arranca");
    }else{
    System.out.println("El vehiculo no enciende");
}
}
}