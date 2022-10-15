/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author banda
 */
public class AUTOMOVIL extends AUTOMOTOR {

   private String color;
    private double precio;
    double gas_restante = getGas();
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double avanza(double gas_restante){
        
        if(gas_restante>=1){
        System.out.println("El Automovil esta avanza");
        gas_restante--;   
        }else{
            System.out.println("La Gasolina se Agoto"); 
        }
        setGas(gas_restante);
        return gas_restante;
        
    };
    public double avanzaDerecha(double gas_restante){
        
        if(gas_restante>=1){
        System.out.println("El Automovil gira a la derecha");
        gas_restante--;   
        }else{
            System.out.println("La Gasolina se Agoto"); 
        }
        setGas(gas_restante);
        return gas_restante;
    }
        
    public double avanzaIzquierda(double gas_restante){
        
        if(gas_restante>=1){
        System.out.println("El vehiculo gira a la izquierda");
        gas_restante--;   
        }else{
            System.out.println("La Gasolina se Agoto"); 
        }
        setGas(gas_restante);
        return gas_restante;
    }
    }

