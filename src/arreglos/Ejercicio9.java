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
public class Ejercicio9 {
    /*
    Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una 
    posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero 
    y así sucesivamente. El ultimo pasa a ser el primero.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos arrray
        int numeros[] = new int[10], numerofinal;
        //Llenamos array
        System.out.println("=== LLENAR ARRAY ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        numerofinal = numeros[9];
        //Movemos todos los numeros
        for (int i = 8; i>=0; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[0] = numerofinal;
        //Mostramos arreglo
        System.out.println("=== ARRAY DESPLAZADO ===");
        for (int numero : numeros) {
            System.out.println(numero+" ");
        }
    }
}
