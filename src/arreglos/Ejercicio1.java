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
public class Ejercicio1 {
    /*
    Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numeros[] = new float[5];
        //Llenamos array
        System.out.println("=== LLENAR NUMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+".Numero: ");
            numeros[i] = Float.parseFloat(leer.nextLine());
        }
        //Mostramos array
        System.out.println("\n=== NUMEROS INGRESADOS ===");
        for (float numero : numeros) {
            System.out.println("Numeros: "+numero);
        }
    }
}
