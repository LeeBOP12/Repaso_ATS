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
public class Ejercicio14 {
    /*
    Leer dos series de 10 enteros. que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en un
    a tercera, de forma que sigan ordenados.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Creamos  arrays
        int tabA[] = new int[10];
        int tabB[] = new int[10];
        int tabC[] = new int[20];
        boolean creciente = true;
        //Llenamos 2 primeros array de forma CRECIENTE
        System.out.println("=== LLENAR ARRAYS ===");
        System.out.println("Tabla A: ");
        for (int i = 0; i < tabA.length; i++) {
            do {
                System.out.print((i + 1) + ".Numero: ");
                tabA[i] = Integer.parseInt(leer.nextLine());
                if (i==0 || tabA[i]>=tabA[i-1]) {
                    creciente=true;
                }else{
                    System.out.println("< NO ESTA EN FORMA CRECIENTE >");
                    creciente=false;
                }
            } while (!creciente);
        }
        System.out.println("Tabla B: ");
        for (int i = 0; i < tabB.length; i++) {
            do {
                System.out.print((i + 1) + ".Numero: ");
                tabB[i] = Integer.parseInt(leer.nextLine());
                if (i==0 || tabB[i]>=tabB[i-1]) {
                    creciente=true;
                }else{
                    System.out.println("< NO ESTA EN FORMA CRECIENTE >");
                    creciente=false;
                }
            } while (!creciente);
        }
        //Unimos TABLAS
        int i=0, j=0, k=0; //Indices para A,B y C  mientras haya elemetnos que almacenar
         while (i<tabA.length && j<tabB.length) {            
             if (tabA[i]<tabB[j]) {
                 tabC[k] = tabA[i];
                 i++;
             } else {
                 tabC[k] = tabB[j];
                 j++;
             }
             k++;
        }
         //COPIAR LOS QUE RESTAN
         if (i==10) { //Se copio todos los elemetnos de A
             while (j<10) {                 
                 tabC[k++] = tabB[j++];
             }
        } else {
             while (i<10) {                 
                 tabC[k++] = tabA[i++];
             }
             
        }
         //Mostramos FUSION
         System.out.println("\n=== FUSION DE TABLAS ===");
         for (int l : tabC) {
             System.out.print(l+" ");
        }
         System.out.println("");
    }
}
