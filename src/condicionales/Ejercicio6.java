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
public class Ejercicio6 {

    /*
    Hacer un programa que tome dos números y diga si ambos son pares o impares
     */
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("NUMEROS PARES O NO\nIngrese primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "NUMEROS PARES");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "NUMEROS IMPARES");
        } else {
            JOptionPane.showMessageDialog(null, "SOLO UNO ES PAR O IMPAR");
        }
    }
}
