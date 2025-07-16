/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio8 {
    /*
    Pedir un número N, y mostrar todos los números del 1 al N.
    */
    public static void main(String[] args) {
        int numero, inicio=1, principio=1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("=== NUMERO HASTA N ===\nIngrese numero: "));
        
        //while
        System.out.println("=== USO WHILE ===");
        while (inicio<=numero) {            
            System.out.println(inicio);
            inicio++;
        }
        //do while
        System.out.println("=== USO DO WHILE ===");
        do {            
            System.out.println(principio);
            principio++;
        } while (principio<=numero);
        //for
        System.out.println("=== USO FOR ===");
        for (int i=1; i<=numero; i++){
            System.out.println(i);
        }
    }
}
