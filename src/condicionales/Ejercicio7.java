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
public class Ejercicio7 {
    /*
    Pedir tres números  y mostrarlos ordenados de mayor a menor
    */
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("=== ORDENAR NUMEROS MAYOR A MENOR ===\nPrimer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Tercer numero: "));

        if (num1 >=num2 && num2 >= num3) {
            JOptionPane.showMessageDialog(null, "Orden: " + num1 + " - " + num2 + " - " + num3);
        } else if (num1 >= num3 && num3 >= num2) {
            JOptionPane.showMessageDialog(null, "Orden: " + num1 + " - " + num3 + " - " + num2);
        } else if (num2 >= num1 && num1 >= num3) {
            JOptionPane.showMessageDialog(null, "Orden: " + num2 + " - " + num1 + " - " + num3);
        } else if (num2 >= num3 && num3 >= num1) {
            JOptionPane.showMessageDialog(null, "Orden: " + num2 + " - " + num3 + " - " + num1);
        } else if (num3 >= num2 && num2 >= num1) {
            JOptionPane.showMessageDialog(null, "Orden: " + num3 + " - " + num2 + " - " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "Orden: " + num3 + " - " + num1 + " - " + num2);
        }
    }
}
