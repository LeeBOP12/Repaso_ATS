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
public class Ejercicio8 {
    /*
    Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. 
    Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén 
    detrás.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos array
        int numeros[] = new int[10], posicion, numero;
        
        //Llenamos primeros 8
        System.out.println("=== LLENAR ARRAY ===");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        //Pedimos numero
        System.out.print("Numero a insertar: ");
        numero = Integer.parseInt(leer.nextLine());
        //Pedimos posicion y validamos
        do {            
            System.out.print("Posicion a insertar: ");
            posicion = Integer.parseInt(leer.nextLine());
        } while (posicion<1 || posicion>9);
        //Quitamos uno para el array
        posicion--;
        //Recorremos posiciones
        for (int i = 7; i>=posicion; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[posicion] = numero;
        //Mostramos nuevo array
        for (int o : numeros) {
            System.out.println(o+" ");
        }
    }
}
