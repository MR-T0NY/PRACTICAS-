/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author banda
 */
public class AUTOMOTOR {
    private String modelo;
    private String marca;
    private double gas;
    
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double acelerar(double gas){
        
        if(gas>=1){
            System.out.println("El automovil avanza de manera más rapida");
            gas--;
        }else{
            System.out.println("Se agoto la gasolina");
        }
        return gas;
   }
   public void frenar(){
       System.out.println("El vehiculo se detuvo");     
   };
}