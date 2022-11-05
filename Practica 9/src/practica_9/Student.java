/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_9;

/**
 *
 * @author banda
 */
public class Student extends Persona {
    
    private String program;
    private String year;
    private double fee;
    
    public Student(String name,String Address, double fee, String year, String program){
      super(name , Address);
    this.name=name;
    this.Address=Address;
    this.fee=fee;
    this.year=year;
    this.program=program;
}
    @Override
    public String toString(){
        this.Dirname = name+ Address;
        return name + ", " + Address + ", " + fee + ", " + year + ", " + program;
    }
    
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
    
}
