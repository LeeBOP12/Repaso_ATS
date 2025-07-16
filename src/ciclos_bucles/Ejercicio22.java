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
public class Ejercicio22 {
    /*
    Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float notas;
        boolean suspenso = false;

        System.out.println("=== NOTAS DE ALUMNOS ===");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print((i + 1) + ".Nota: ");
                notas = Float.parseFloat(leer.nextLine());
                if (notas < 4) {
                    suspenso = true;
                }
                if (notas<0 || notas>10) {
                    System.out.println("NOTA FUERA DE RANGO [0 - 10]");
                }
            } while (notas < 0 || notas > 10);
        }
        if (suspenso) {
            System.out.println("Hay al menos un alumno suspenso :v");
        } else {
            System.out.println("No hay alumnos suspensos :D");
        }
    }
}
