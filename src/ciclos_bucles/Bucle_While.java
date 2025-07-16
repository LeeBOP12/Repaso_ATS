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
public class Bucle_While {
    /*
    while (condicion) {
        Instrucciones
    }
    
    Nota: Se evalua primero la condicion para seguir
    */
    public static void main(String[] args) {
        //Ejemplo numeros del 1-N
        Scanner leer = new Scanner(System.in);
        int inicio=1,fin;
        
        System.out.print("Mostrar numeros hasta:  ");
        fin = Integer.parseInt(leer.nextLine());
        
        while (inicio<=fin) {            
            System.out.println(inicio);
            inicio++; //Incrementar en uno o tambine inicio+=2;
        }
    }
}
