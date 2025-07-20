/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio13 {
    /*
    Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera y a continuación los elementos impares.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Creamos arrays y variables
        int numeros[] = new int[10], numeros2[] = new int[10], contP = 0;
        //Llenamos array
        System.out.println("=== PARES Y IMPARES ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        // Agregar pares primero
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros2[contP] = numeros[i];
                contP++;
            }
        }

        // Agregar impares después
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                numeros2[contP] = numeros[i];
                contP++;
            }
        }

        // Mostrar resultado
        System.out.println("\n=== PRIMERO PARES Y LUEGO IMPARES ===");
        for (int i : numeros2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
