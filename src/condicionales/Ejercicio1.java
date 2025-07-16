/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio1 {
    /*
    Hacer un programa que lea un numero entero y muestre si el numero es múltiplo de 10
    */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        
        if (numero%10==0) {
            JOptionPane.showMessageDialog(null, "EL NUMERO ES MULTIPLO DE 10");
        }else {
            JOptionPane.showMessageDialog(null, "EL NUMERO NO ES MULTIPLO DE 10");
        }
    }
}
