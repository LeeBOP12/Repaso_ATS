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
public class Ejercicio16 {
    /*
    Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, inicio=0, principio = 0;
        
        System.out.println("=== TABLA DE MULTIPLICAR ===");
        do {            
            System.out.print("Numero: ");
            numero = Integer.parseInt(leer.nextLine());
        } while (numero<0 || numero>10);
        
        //while
        System.out.println("=== USO WHILE ===");
        while (inicio<=12) {            
            System.out.println(numero+" x "+inicio+" = "+(numero*inicio));
            inicio++;
        }
        //do while
        System.out.println("=== USO DO WHILE ===");
        do {            
            System.out.println(numero+" x "+principio+" = "+(numero*principio));
            principio++;
        } while (principio<=12);
        // for
        System.out.println("=== USO FOR ===");
        for (int i = 0; i <= 12; i++) {
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
    }
}
