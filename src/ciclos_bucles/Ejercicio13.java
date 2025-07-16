/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio13 {
    /*
    Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, contP = 0, contN = 0, contC = 0, sumaP = 0, sumaN = 0;

        System.out.println("=== CONTADOR DE NUMEROS ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            numero = Integer.parseInt(leer.nextLine());
            if (numero == 0) {
                contC++;
            } else if (numero > 0) {
                sumaP += numero;
                contP++;
            } else {
                sumaN+=numero;
                contN++;
            }
        }
        System.out.println("\n=== RESULTADOS ====");
        if (contP == 0) {
            System.out.println("No hay numeros positivos");
        } else {
            System.out.println("Media de positivos: " + (sumaP / contP));
        }
        if (contN == 0) {
            System.out.println("No hay numeros negativos");
        } else {
            System.out.println("Media de negativos: " + (sumaN / contN));
        }
        System.out.println("Numero de ceros: " + contC);
    }
}
