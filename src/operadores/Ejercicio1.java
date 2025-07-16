/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio1 {
    /*
    Hacer un programa que calcule e imprima la suma de tres calificaciones
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        float n1, n2, n3, notaf;
        
        System.out.println("==== INGRESE NOTAS ====");
        System.out.print("Nota 1: ");
        n1 = Float.parseFloat(leer.nextLine());
        System.out.print("Nota 2: ");
        n2 = Float.parseFloat(leer.nextLine());
        System.out.print("Nota 3: ");
        n3 = Float.parseFloat(leer.nextLine());
        
        //Redondeamos nota para ponderado (Lo elimine :v)
        notaf = n1 + n2 + n3;
        
        System.out.println("\n=== RESULTADO DE NOTAS ===");
        System.out.println("Nota Final: "+notaf);
        
    }
}
