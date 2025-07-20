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
public class Ejercicio6 {
    /*
    Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3A, 3B, 3A, 3B, etc.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definimos arreglos
        int a[] = new int[12], b[] = new int[12], c[] = new int[24];
        
        //Llenamos los arreglos
        System.out.println("=== LLENAR TABLAS ===");
        System.out.println("Tabla A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+".Numero: ");
            a[i] = Integer.parseInt(leer.nextLine());
        }
        System.out.println("Tabla B: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print((i+1)+".Numero: ");
            b[i] = Integer.parseInt(leer.nextLine());
        }
        //Mezclamos arreglo 3 del A, 3 del B
        int j = 0;
        for (int i = 0; i < 12; i+=3) {
            //Tres elementos del A
            c[j++] = a[i];
            c[j++] = a[i+1];
            c[j++] = a[i+2];
            //Tres elementos del B
            c[j++] = b[i];
            c[j++] = b[i+1];
            c[j++] = b[i+2];
        }
        //Mostramos tabla C
        System.out.println("=== RESULTADO UNIDO ===");
        for (int i : c) {
            System.out.println(i+" ");
        }
    }
}
