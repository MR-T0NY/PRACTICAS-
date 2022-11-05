/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_6;

/**
 *
 * @author banda
 */
public class Computadora extends COMP_ELECTR implements IOtrosComponentesE{

    @Override
    public String encender() {
        return "Computadora Encendida";
    }

    @Override
    public String Apagar() {
       return "Computadora Apagada";
    }
    
}
