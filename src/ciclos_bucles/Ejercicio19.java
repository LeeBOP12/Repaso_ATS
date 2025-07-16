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
public class Ejercicio19 {
    /*
    Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float nota, contA = 0, contC = 0, contS = 0;

        System.out.println("=== NOTAS DE ALUMNOS ===");
        for (int i = 1; i < 7; i++) {
            do {
                System.out.print(i+".Nota: ");
                nota = Float.parseFloat(leer.nextLine());
                if (nota < 0 || nota > 10) {
                    System.out.println("< NOTA FUERA DE RANGO [0 - 10]");
                }
            } while (nota < 0 || nota > 10);
            if (nota < 4) {
                contS++;
            } else if (nota==4) {
                contC++;
            } else {
                contA++;
            }
        }
        System.out.println("=== RESUMEN DE ALUMNOS ===");
        System.out.println("Alumnos aprobados: "+contA);
        System.out.println("Alumnos condicionados: "+contC);
        System.out.println("Alumnos suspensos: "+contS);
    }
}
