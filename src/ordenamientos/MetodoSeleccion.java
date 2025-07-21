/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class MetodoSeleccion {
    /*
     * MÉTODO DE SELECCIÓN:
     * Paso 1: Buscar el elemento menor del arreglo (desde la posición i en adelante)
     * Paso 2: Intercambiarlo con el que está en la posición i
     * Paso 3: Repetir el proceso desde i = 0 hasta el penúltimo elemento
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros[], tamaño, aux, min;

        // Definir el tamaño del arreglo
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo: "));
        numeros = new int[tamaño];

        // Llenar el arreglo con números ingresados por el usuario
        System.out.println("=== INGRESE LOS NÚMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        // ORDENAMIENTO POR SELECCIÓN (CRECIENTEMENTE)
        for (int i = 0; i < numeros.length; i++) {
            // Suponemos que el número más pequeño está en la posición i
            min = i;
            // Recorremos el resto del arreglo para encontrar un número más pequeño
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j; // Guardamos la posición del número más pequeño encontrado
                }
            }
            // Intercambiamos el número de la posición i con el número menor encontrado
            aux = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = aux;
        }
        // Mostrar el arreglo ordenado
        System.out.println("\n=== ARREGLO ORDENADO CRECIENTEMENTE ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        //Arreglo ordenado de forma decreciente
        System.out.println("\n=== ARREGLO ORDENADO DECRECIENTEMENTE ===");
        for (int i = numeros.length-1; i >=0; i--) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
}