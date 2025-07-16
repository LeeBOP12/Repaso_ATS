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
public class Ejercicio21 {
    /*
    Pedir 10 números, y mostrar al final si se ha introducido alguno negativo
    */
    public static void main(String[] args) {
        int numero, contN=0;
        boolean negativos=false;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("=== INGRESE NUMEROS ===");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Numero: ");
            numero = Integer.parseInt(leer.nextLine());
            if (numero<0) {
                contN++;
                negativos = true;
            }
        }
        if (!negativos) {
            System.out.println("\nNo se ingresaron numeros negativos");
        } else {
            System.out.println("Se ingreso numeros negativos: "+contN);
        }
    }
}
