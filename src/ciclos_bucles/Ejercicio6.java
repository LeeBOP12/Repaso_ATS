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
public class Ejercicio6 {
    /*
    Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
    */
    public static void main(String[] args) {
        int numero, suma=0;
        
        do {            
            numero = Integer.parseInt(JOptionPane.showInputDialog("=== SUMA DE NUMEROS ===\nIngrese numero: "));
            suma+=numero;
        } while (numero!=0);
        JOptionPane.showMessageDialog(null, "Suma de numeros ingresados: "+suma);
    }
}
