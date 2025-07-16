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
public class Ejercicio1 {
    /*
    Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
     */
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("=== CUADRADO DE UN NÚMERO ===\nIngrese un número:"));

        while (numero >= 0) {
            int cuadrado = numero * numero;
            JOptionPane.showMessageDialog(null, "Cuadrado de numero: "+cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (negativo para salir):"));
        }
        JOptionPane.showMessageDialog(null, "Número negativo :V");
    }
}
