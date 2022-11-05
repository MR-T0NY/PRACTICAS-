/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7;

/**
 *
 * @author banda
 */
public abstract class Animal {
    
    private String edad;
    private String Nombre;
    private String Comer;
    private String Raza;

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Comer
     */
    public String getComer() {
        return Comer;
    }

    /**
     * @param Comer the Comer to set
     */
    public void setComer(String Comer) {
        this.Comer = Comer;
    }
   
    public String Caminar(double caminar){
        return "caminar";
    }
    public abstract String caminar(double caminar);
}
