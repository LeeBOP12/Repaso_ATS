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
public class Ejercicio12 {
    /*
    Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). 
    Eliminar el elemento situado en la posición dada sin dejar huecos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos array
        int numeros[] = new int[10];
        //Llenamos array
        System.out.println("=== INGRESE NUMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        int posicion;
        do {
            System.out.print("Posicion a eliminar [0-9]: ");
            posicion = Integer.parseInt(leer.nextLine());
        } while (posicion < 0 || posicion > 9);
        //Eliminamos elemento de posicion
        //1 3 3 4 5 6 7 8 9 10
        for (int i = posicion; i < 9; i++) {
            numeros[i] = numeros[i+1];
        }
        //Mostramos arrar
        System.out.println("\n=== NUEVO ORDEN ===");
        for (int i = 0; i < 9; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
}
