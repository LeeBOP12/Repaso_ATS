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
public class Ejercicio2 {

    /*
    Pedir dos números y decir cual es el mayor o si son iguales
     */
    public static void main(String[] args) {
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("=== NUMERO MAYOR O MENOS ===\nIngrese Primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));

        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "LOS NUMEROS SON IGUALES");
        } else if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "EL PRIMER NUMERO ES MAYOR: " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "EL SEGUNDO NUMERO ES MAYOR: " + n2);
        }

    }
}
