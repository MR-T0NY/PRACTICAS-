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
public class Trenes extends Vehiculo{
    public Trenes(){

}
     public Trenes(int Vapor){
        this.encenderTren(Vapor);
        this.avanzarTren(Vapor);
    }
    
    public Trenes(double carga){
        this.encenderTren(carga);
        this.avanzarTren(carga);
    } 
    private void encenderTren(int Vapor){
        if(Vapor > 1){
            System.out.println("El tren esta encendido");
            }else{
            System.out.println("El tren no tiene suficiente gasolina");
        }
    }
    private void avanzarTren(int Vapor){
        if (Vapor>1 && Vapor<10){
            System.out.println("El tren no genera suficiente vapor");
        }else{
            System.out.println("El tren puede arrancar");
        }
        }
    private void encenderTren(double carga){
        if(carga > 75){
            System.out.println("El tren puede encender sin problemas");
        }else{
            System.out.println("El tren necesita de una fuente de alimentacion para arrancar");
        }
    }
    private void avanzarTren(double carga){
        if(carga>12 && carga<20){
        System.out.println("El Tren puede arrancar sin problema alguno");
    }else{
    System.out.println("El Avion no avanza por falta de carga");
}
}
}


