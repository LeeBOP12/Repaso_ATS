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
public class Ejercicio7 {
     /*
    Pedir números hasta que se introduzca uno negativo y calcular la media.
    */
    public static void main(String[] args) {
        int numero, cont = 0;
        float suma = 0;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("=== MEDIA ARITMÉTICA ===\nIngrese número: "));
            
            if (numero >= 0) {
                suma += numero;
                cont++;
            }
        } while (numero >= 0);
        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Media: " + (suma / cont));
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números válidos.");
        }
    }
}
