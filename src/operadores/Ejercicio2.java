/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio2 {
    /*
    Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas 
    semanales trabajadas y de su salario por hora
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float horasS, salarioH, sueldoM;
        
        System.out.println("=== SUELDO TRABAJADOR ====");
        System.out.print("Horas Semanales: ");
        horasS = Float.parseFloat(leer.nextLine());
        System.out.print("Sueldo por hora: ");
        salarioH = Float.parseFloat(leer.nextLine());
        
        sueldoM = horasS*salarioH;
        
        System.out.println("Pago mensual: "+sueldoM);
    }
}
