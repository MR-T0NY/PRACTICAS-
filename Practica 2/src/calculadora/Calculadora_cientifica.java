/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author banda
 */
public class Calculadora_cientifica extends DISOperacionesBasicas implements IdisOperaciones_Avan{

    @Override
    public double Elevado(double a) {    
        return a*a;
        
    }

    @Override
    public double Raiz(double a) {
        return Math.sqrt(a);
}
    
}
