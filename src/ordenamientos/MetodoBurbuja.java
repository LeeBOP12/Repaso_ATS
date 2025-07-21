/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class MetodoBurbuja {
    /*
    Metodo Burbuja:
    ARREGLOSS ELEMENTO POR ELEMENTO, CAMBIANDO SU POSICION, SE CAMBIARAN DE POSICIONES HASTA QUE ESTE COMPLETAMENTE ORDENADO
    
    FORMA:
    NumeroActual > nuemroSiguiente (Cambio de lugar) ----> DOS FOR ANIDADOS
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Creamos arreglo
        int numeros[],  tamaño, aux;
        //Definimos tamaño de arreglo
        System.out.println("=== TAMAÑO DE ARREGLO ===");
        System.out.print("Tamaño: ");
        tamaño = Integer.parseInt(leer.nextLine());
        //Guardamos tamaño
        numeros = new int[tamaño];
        //Llenamos arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        //METODO BURBUJA
        //Ordenado con las vueltas suficientes (tamaño - 1)
        for (int i = 0; i < numeros.length-1; i++) {
            //Ordenar elementos con condicional
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j]>numeros[j+1]) {
                    //Guradamos elemento
                    aux = numeros[j];
                    //Asignamos valor
                    numeros[j] = numeros[j+1];
                    //Ponemsoe l valor guardado al anterior
                    numeros[j+1] = aux;
                }
            }
        }
        //ARREGLO ORDENADO DE FORMA CRECIENTE
        System.out.println("=== ARREGLO ORDENADO CRECIENTEMENTE ===");
        for (int numero : numeros) {
            System.out.print(numero+" ");
        }
        //ARREGLO ORDENADO DE FORMA DECRECIENTE
        System.out.println("\n=== ARREGLO ORDENADO DECRECIENTEMENTE ===");
        for (int i = numeros.length-1; i>=0; i--) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
}
