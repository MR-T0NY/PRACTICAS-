/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author banda
 */
public abstract class Vehiculo {
    private String modelo;
    private String marca;
    private String color;
    
    public String getModelo(){
        return modelo;
    }
    public String setModeo(String modelo){
        return this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String setMarca(String marca){
        return this.marca=marca;
    }
    public String getColor(){
        return color;
    }
    public String setColor(String Color){
        return this.color;
    }
}
