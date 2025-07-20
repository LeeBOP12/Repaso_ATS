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
public class Ejercicio4 {
    /*
    Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden: el primero, el ultimo, el 
    segundo, el penúltimo, el tercero, etc.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definimos arreglo
        int enteros[] = new int[10];
        
        //Llenamos arreglo
        System.out.println("=== INGRESE NUMEROS ===");
        for (int i = 0; i < enteros.length; i++) {
            System.out.print((i+1)+".Numero: ");
            enteros[i] = Integer.parseInt(leer.nextLine());
        }
        //Mostrarlos en el orden pedido
        System.out.println("\n=== PRIMERO Y ULTIMO... ==");
        for (int i = 0; i < 5; i++) {   
            System.out.print(enteros[i]+ " ");
            System.out.print(enteros[9-i]+ " ");
        }
        System.out.println();
    }
}
