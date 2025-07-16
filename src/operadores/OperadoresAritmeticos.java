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
public class OperadoresAritmeticos {
    /*
    OPERADCIONES BASICAS:
    suma = "+"
    resta = "-"
    producto = "*"
    division = "/"
    resto/residuo = "%"
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numero1, numero2, suma, resta, producto, division, resto;
        
        System.out.println("==== INGRESE NUMEROS ====");
        System.out.print("Numero 1: ");
        numero1 = Float.parseFloat(leer.nextLine());
        System.out.print("Numero 2: ");
        numero2 = Float.parseFloat(leer.nextLine());
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        producto = numero1*numero2;
        division = numero1/numero2;
        resto = numero1%numero2;
        
        System.out.println("\n==== RESULTADOS ARITMETICOS ====");
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Producto: "+producto);
        System.out.println("Division: "+division);
        System.out.println("Resto: "+resto);
    }
}
