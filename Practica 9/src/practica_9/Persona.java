/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_9;

public class Persona {
    
    String name;
    String Address;
    String Dirname;
    
    public Persona(String name, String address){
        this.name=name;
        this.Address=address;
    }
    
    @Override
     public String toString(){
         
       return name + ", " + Address;
   }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getAddress() {
        return Address;
    }

    
    public void setAddress(String Address) {
        this.Address = Address;
    }
     
}
