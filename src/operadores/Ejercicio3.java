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
public class Ejercicio3 {
    /*
    Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo 
    que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que 
    tienen entre los tres
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float g, l, j;
        
        System.out.println("=== ¿CUANTO TIENE CADA UNO?");
        System.out.print("Dinero de Guillermo: ");
        g = Float.parseFloat(leer.nextLine());
        
        l = g/2;
        j = (g+l)/2;
        
        System.out.println("=== SUMA ENTRE LOS TRES ====");
        System.out.println("Dinero total: "+(g+l+j));
    }
    
}
