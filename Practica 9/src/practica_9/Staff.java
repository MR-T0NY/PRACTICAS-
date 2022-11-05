/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_9;

/**
 *
 * @author banda
 */
public class Staff extends Persona {
   
   private String School;
   private double pay;
   
   public Staff(String name, String address, String school, double Pay){
       super(name, address);
       this.School=school;
       this.pay=Pay;
       this.name=name;
       this.Address=address;
    }
   
   @Override
   public String toString(){
       this.Dirname = name + Address + pay + School;
       return name + ", " + Address + ", " + pay + ", " + School;
       
   }
    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public double getPay() {
        return pay;
    }
    
    public void setPay(double pay) {
        this.pay = pay;
    }

   
}
