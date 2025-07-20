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
public class Ejercicio7 {
    /*
    Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, 
    decreciente, desordenados
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definimos arreglo
        int numeros[] = new int[10];
        boolean creciente = false, decreciente = false;
        //Llenamos arreglo
        System.out.println("=== CRECIENTE, DECRECIENT, DESORDENADOS O IGAULES ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        //Verificamos si estan crecientes o no
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) { // 1 2 3 4 5 6 7 8
                creciente = true;
            }
            if (numeros[i] > numeros[i + 1]) { // 8 7 6 5 4 3 2 1
                decreciente = true;
            }
        }
        //Mostramos resultados
        System.out.println("\n=== RESULTADOS ===");
        if (creciente == true && decreciente == false) {
            System.out.println("NUMEROS DE FORMA CRECIENTE");
        } else if (creciente == false && decreciente == true) {
            System.out.println("NUMEROS DE FORMA DECRECIENTE");
        } else if (creciente == true && decreciente == true) {
            System.out.println("NUMEROS DE FORMA DESORDENADA");
        } else {
            System.out.println("TODOS LOS NUMEROS SON IGUALES");
        }
    }
}
