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
public class Ejercicio20 {
    /*
    Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantS;
        float sueldo, sueldomax = 0;
        System.out.println("=== SUELDOS ===");
        System.out.print("Cantidad de sueldos: ");
        cantS = Integer.parseInt(leer.nextLine());

        for (int i = 0; i < cantS; i++) {
            do {
                System.out.print((i + 1) + ".Sueldo: ");
                sueldo = Float.parseFloat(leer.nextLine());
            } while (sueldo < 0);
            if (sueldo > sueldomax) {
                sueldomax = sueldo;
            }
        }
        System.out.println("Sueldo mayor: " + sueldomax);
    }
}
