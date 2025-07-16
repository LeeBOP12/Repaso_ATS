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
public class Ejercicio3 {
    /*
    Leer números hasta se introduzca un 0. Para cada uno indicar si es par o impar.
    */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("=== PAR O IMPAR ===\nIngrese numero: "));
        
        while (numero!=0) {            
            if (numero%2==0) {
                JOptionPane.showMessageDialog(null, "PAR");
            } else {
                JOptionPane.showMessageDialog(null, "IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        }
        JOptionPane.showMessageDialog(null, "Saliendo....");
    }
}
