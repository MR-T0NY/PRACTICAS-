/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author banda
 */
public abstract class Disp_Electronico {
    private String marca;
    private String color;
    
    public abstract String Encender();
    
    public String Apagar(){
    return ("Dispositivo apagado");
}
}