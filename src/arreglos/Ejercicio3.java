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
public class Ejercicio3 {
    /*
    Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, 
    la media de los negativos y contar el número de ceros.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float sumaP = 0, sumaN = 0, numeros[];
        int contC = 0, contP = 0, contN = 0;
        //Tamaño de arreglo
        numeros = new float[5];
        //Llenamos arreglo
        System.out.println("=== POSITIVOS, NEGATIVOS, CEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ".Numero: ");
            numeros[i] = Float.parseFloat(leer.nextLine());
            //Separamos positivos, negativos y ceros
            if (numeros[i] > 0) {
                sumaP += numeros[i];
                contP++;
            } else if (numeros[i] < 0) {
                sumaN += numeros[i];
                contN++;
            } else {
                contC++;
            }
        }
        System.out.println("\n=== RESULTADOS ===");
        if (contP == 0) {
            System.out.println("No se ingresaron numeros positivos");
        } else {
            System.out.println("Media positivos: " + (sumaP / contP));
        }
        if (contN == 0) {
            System.out.println("No se ingresaron numeros negativos");
        } else {
            System.out.println("Media negativos: " + (sumaN / contN));
        }
        System.out.println("Cantidad de ceros: " + contC);
    }
}
