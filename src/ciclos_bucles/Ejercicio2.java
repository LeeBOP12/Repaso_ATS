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
public class Ejercicio2 {
    /*
    Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca 0.
    */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("=== POSITIVO O NEGATIVO ===\nIngrese numero: "));
        while (numero!=0) {            
            if (numero>0) {
                JOptionPane.showMessageDialog(null, "POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        }
        JOptionPane.showMessageDialog(null, "Saliendo....");
    }
}
