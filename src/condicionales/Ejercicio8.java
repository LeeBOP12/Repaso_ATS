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
public class Ejercicio8 {
    /*
    Pedir un número entre 0 y 99 999 y decir cuantas cifras tiene.
    */
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("=== CIFRAS DE UN NUMERO ===\nIngrese numero: "));

        if (numero < 10 && numero > 0) {
            JOptionPane.showMessageDialog(null, "1 Cfra");
        } else if (numero < 100 && numero > 10) {
            JOptionPane.showMessageDialog(null, "2 Cifras");
        } else if (numero < 1000 && numero > 100) {
            JOptionPane.showMessageDialog(null, "3 Cifras");
        } else if (numero < 10000 && numero > 1000) {
            JOptionPane.showMessageDialog(null, "4 Cifras");
        } else if (numero < 100000 && numero > 10000) {
            JOptionPane.showMessageDialog(null, "5 Cifras");
        } else {
            JOptionPane.showMessageDialog(null, "No es un numero entre [0- 99 999)");
        }
    }
}
