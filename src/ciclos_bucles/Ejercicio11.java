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
public class Ejercicio11 {
    /*
    Diseñar un programa que muestre el producto de los 10 primeros números impares.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long producto = 1;
        
        System.out.println("=== PRODUCTO DE IMPARES ===");
        for (int i = 1; i <= 20; i+=2) {
                producto*=i;
        }
        System.out.println("Resultado de producto: "+producto);
    }
}
