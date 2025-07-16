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
public class Ejercicio6 {
    /*
    Hacer un programa que calcule el cuadrado de una suma:
    (a+b)^2 = a^2 + 2ab + b^2
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float a,b, cuadrado;
        System.out.println("==== BINOMIO AL CUADRADO (a+b)^2 =====");
        System.out.print("a: ");
        a = Float.parseFloat(leer.nextLine());
        System.out.print("b: ");
        b = Float.parseFloat(leer.nextLine());
        
        cuadrado = (float) Math.pow(a+b, 2);
        
        System.out.print("\nResultado de binomio al cuadrado: "+cuadrado);
    }
}
