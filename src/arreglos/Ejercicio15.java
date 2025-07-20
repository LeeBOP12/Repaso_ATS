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
public class Ejercicio15 {

    /*
    Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la 
    posición en que se encuentra. Si no esta indicarlo con un mensaje.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos array
        int enteros[] = new int[10];
        boolean creciente = true;
        //Llenamso array
        System.out.println("=== LLENAR ARRAY ORDENADO ===");
        for (int i = 0; i < enteros.length; i++) {
            //Validamos que sea de forma creciente
            do {
                System.out.print((i + 1) + ".Numero: ");
                enteros[i] = Integer.parseInt(leer.nextLine());
                if (i == 0 || enteros[i] >= enteros[i - 1]) {
                    creciente = true;
                } else {
                    creciente = false;
                    System.out.println("< NO ESTA DE FORMA CRECIENTE >");
                }
            } while (!creciente);
        }
        //Pedimso numero a buscar
        System.out.print("Numero a buscar: ");
        int numero = Integer.parseInt(leer.nextLine());
        int posicion = -1;
        //Buscamos el numero
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == numero) {
                posicion = i;
                break;
            }
        }
        if (posicion==-1) {
            System.out.println("NO SE ENCONTRO EL NUMERO");
        }else {
            System.out.println("NUMERO ENCONTRADO EN LA POSICION: "+posicion);
        }
    }
}
