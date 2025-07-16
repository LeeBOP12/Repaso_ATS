/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio12 {
    /*
    Pedir un numero y calcular su factorial.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, fac=1;
        
        System.out.println("=== FACTORIAL NUMERO ===");
        System.out.print("Numero: ");
        numero = Integer.parseInt(leer.nextLine());
        for (int i = 1; i <= numero; i++) {
            fac*=i;
        }
        System.out.println("Factorial de "+numero+"!: "+fac);
    }
}
