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
public class Avion extends Vehiculo{
    public Avion(){
        
    }
    public Avion(int Gas){
        this.encenderAvion(Gas);
        this.avanzarAvion(Gas);
    }
    
    public Avion(double carga){
        this.encenderAvion(carga);
        this.avanzarAvion(carga);
    } 
    private void encenderAvion(int Gas){
        if(Gas > 1){
            System.out.println("El Avion esta encendido");
            }else{
            System.out.println("El Avion no tiene suficiente gasolina");
        }
    }
    private void avanzarAvion(int Gas){
        if (Gas>1 && Gas<10){
            System.out.println("El Avion le queda poca gasolina");
        }else{
            System.out.println("El Avion puede despegar");
        }
        }
    private void encenderAvion(double carga){
        if(carga > 75){
            System.out.println("El Avion puede encender sin problemas");
        }else{
            System.out.println("El Avion necesita un cambio de carga");
        }
    }
    private void avanzarAvion(double carga){
        if(carga>12 && carga<20){
        System.out.println("El Avion puede despegar sin problema alguno");
    }else{
    System.out.println("El Avion no avanza por falta de carga");
}
}
}
