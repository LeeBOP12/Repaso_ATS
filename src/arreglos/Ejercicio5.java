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
public class Ejercicio5 {
    /*
    Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: 1A, 1B, 2A, 2B, etc.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definimos 3 arreglos
        int tabA[]= new int[10], tabB[] = new int[10], tabC[] = new int[20];
        
        //Llenamos arreglos
        System.out.println("=== UNIR ARREGLOS ===");
        System.out.println("Tabla A");
        for (int i = 0; i < tabA.length; i++) {
            System.out.print("Numero: ");
            tabA[i] = Integer.parseInt(leer.nextLine());
        }
        System.out.println("Tabla B: ");
        for (int i = 0; i < tabB.length; i++) {
            System.out.print("Numero: ");
            tabB[i] = Integer.parseInt(leer.nextLine());
        }
        //Mezclamos las tablas 1A, 1B, 2A, 2B
        int j=0;
        for (int i = 0; i < 10; i++) {
            tabC[j] = tabA[i];
            j++;
            tabC[j] = tabB[i];
            j++;
        }
        System.out.println("\n=== RESULTADO ====");
        for (int i : tabC) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
