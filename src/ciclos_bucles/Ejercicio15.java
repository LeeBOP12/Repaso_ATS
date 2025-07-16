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
public class Ejercicio15 {
    /*
    Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos 
    mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad, contE = 0, contA = 0, sumaE = 0;
        float estatura, sumaA = 0;

        System.out.println("=== EDADES Y ALTURAS ===");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print((i + 1) + ".Edad: ");
                edad = Integer.parseInt(leer.nextLine());
                System.out.print((i + 1) + ".Estatura: ");
                estatura = Float.parseFloat(leer.nextLine());
            } while (edad < 0 || estatura < 0);
            if (edad > 18) {
                contE++;
            }
            if (estatura > 1.75) {
                contA++;
            }
            sumaE += edad;
            sumaA += estatura;
        }
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Media de edades: " + (sumaE / 5.0));
        System.out.println("Media estatura: " + (sumaA / 5.0f));
        System.out.println("Alumnos mayores a 18: " + contE);
        System.out.println("Alumnos mayores a 1.75 m: " + contA);
    }
}
