/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_9;
import java.util.Scanner;
/**
 *
 * @author banda
 */
public class PRACTICA_9 {

    
    public static void main(String[] args) {
        System.out.println("-------Persona-------");
       Scanner u = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String name = u.nextLine();
        System.out.println("Ingrese la direccion de la persona: ");
        String Address = u.nextLine();
        Persona p = new Persona(name, Address);
        System.out.println(p.toString());
        
        System.out.println("\n-------Staff------");
        System.out.println("Ingrese el nombre:");
        String nombre = u.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = u.nextLine();
        System.out.println("Ingrese el nombre de la escuela: ");
        String escuela = u.nextLine();
        System.out.println("Ingrese la cantidad de pago: ");
        double Pago = u.nextDouble();
        Staff st = new Staff(nombre, direccion, escuela, Pago);
        System.out.println(st.toString());
        
        System.out.println("\n---------Student--------");
        System.out.println("Ingrese el nombre del alumno: ");
        String l = u.nextLine();
        String nom = u.nextLine();
        System.out.println("Ingrese la direccion del alumno: ");
        String dir = u.nextLine();
        System.out.println("Ingrese el pago que realiza el alumno: ");
        double fee = u.nextDouble();
        System.out.println("Ingrese el anio que cursa el alumno: ");
        String m = u.nextLine();
        String year = u.nextLine();
        System.out.println("Ingrese la carrera del alumno: ");
        String program = u.nextLine();
        Student std = new Student (nom, dir, fee, year, program);
        System.out.println(std.toString());
        }
    
}
