/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author banda
 */
public class Telefono extends Disp_Electronico implements IdOperaciones_Arit {

    private String modelo;
    private String carga;
    
    public Telefono(){
        
    }
    public Telefono (String carga){
        this.carga=carga;
    }
    @Override
    public String Encender() {
       if (this.carga.contains("carga")){
    } 
    return "Telefono Encendido"; 
    }
     
    
    @Override
    public String Apagar(){ 
        System.out.println("El telefono esta apagado");
        return null;
    }
    
    public String Hacerllamadas (){
        return "Llamando" + int.class.toString();
    }
    public String TerminarLlama (){
        return "La llamada a terminado";
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

    boolean TerminarLlama(String fin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
