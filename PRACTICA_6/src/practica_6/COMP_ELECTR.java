/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_6;

/**
 *
 * @author banda
 */
public abstract class COMP_ELECTR {

    private String color;
    private String Modelo;
    private String Marca;
    private String Año;
    private String SO;//Sistema Operativo
    
     /**
     * @return the SO
     */
    public String getSO() {
        return SO;
    }

    /**
     * @param SO the SO to set
     */
    public void setSO(String SO) {
        this.SO = SO;
    }
    /**
     * @return the Año
     */
    public String getAño() {
        return Año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(String Año) {
        this.Año = Año;
    }
    
    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
     
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public abstract String encender();
    
    
    }
