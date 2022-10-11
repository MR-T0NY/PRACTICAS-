/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author banda
 */
public class Calculadora extends Disp_Electronico implements IdOperaciones_Arit {

    @Override
    public String Encender() {
        return "Calculadora encendida";
    }
    
    @Override
    public double suma(double a, double b) {
        return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }

    
    public double Mult(double a, double b) {
        return a*b;
    }
    public String Apagar(){
    return "Dispositivo apagado";
    }
}
