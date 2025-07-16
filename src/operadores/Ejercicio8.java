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
public class Ejercicio8 {
    /*
    Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de secundo grado de coeficientes 
    reales : ax^2 + bx + c = 0.  Formula general: x = (-b +- raíz cuadrada (b^2 - 4ac))/2a
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float a, b, c, x1, x2;
         
         System.out.println("=== CALCULAR RAIZES 'X' ===");
         System.out.println("FORMA : ax^2 + bx + c = 0");
         System.out.print("Valor de a: ");
         a = Float.parseFloat(leer.nextLine());
         System.out.print("Valor de b: ");
         b = Float.parseFloat(leer.nextLine());
         System.out.print("Valor de c: ");
         c = Float.parseFloat(leer.nextLine());
         
         x1 = (float) (-b+ Math.sqrt(Math.pow(b, 2)- 4*a*c))/(2*a);
         x2 = (float) (-b- Math.sqrt(Math.pow(b, 2)- 4*a*c))/(2*a);
         
         System.out.println("\n=== VALORES DE X ===");
         System.out.println("X1 = "+x1);
         System.out.println("X2 = "+x2);
         leer.close();
        
    }
}
