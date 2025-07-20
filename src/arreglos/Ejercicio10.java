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
public class Ejercicio10 {
    /*
    Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo (N es digitado por el usuario).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos Array
        int numeros[] = new int[10], veces, ultimo = 0, cont = 0;
        //Llenamos Array
        System.out.println("=== INGRESE NUMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        //Pedimos cuantas veches hacer la rotacion
        System.out.print("# veces a desplazar: ");
        veces = Integer.parseInt(leer.nextLine());
        //Desplazamos array N veces

        for (int i = 0; i < veces; i++) {
            ultimo = numeros[9];
            //Movemos todos los numeros
            for (int j = 8; j >= 0; j--) {
                numeros[j + 1] = numeros[j];
            }
            numeros[0] = ultimo;
        }
        //Mostramos arrray desplazado
        System.out.println("\n=== ARRAY DEZPLAZADO ===");
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
    }
}
