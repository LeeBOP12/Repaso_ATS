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
public class Ejercicio11 {
    /*
    Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en 
    una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos los 2 array
        int[] numeros = new int[10];
        boolean creciente=true;
        //Llenamso primer arrray
        System.out.println("=== INGRESE NUMEROS ===");
        for (int i = 0; i < 5; i++) {
            do {                
                System.out.print((i+1)+".Numero: ");
                numeros[i] = Integer.parseInt(leer.nextLine());
                if (i==0 || numeros[i]>=numeros[i-1]) {
                    creciente=true;
                } else {
                    System.out.println("< Numeros no estan de forma creciente >");
                    creciente=false;
                }
            } while (!creciente);
        }
        //Pedimos nevo numero a insertar
        int numero, pos=0;
        System.out.print("Numero a insertar: ");
        numero = Integer.parseInt(leer.nextLine());
        
        //Buscar posicion adecuada
        while (numeros[pos]<numero && pos<5) {            
            pos++;
        }
        //Movemos todos los elementos
        for (int i = 4; i>=pos; i--) {
            numeros[i+1] = numeros[i];
        }
        //Guardamos numero en la poscion
        numeros[pos] = numero;
        //Mostramo orden
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
}
