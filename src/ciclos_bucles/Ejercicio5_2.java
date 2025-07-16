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
public class Ejercicio5_2 {

    /*
    Realizar un juego para adivinar un numero. Para ello generar un número aleatorio entre 0-100, y 
    luego ir pidiendo números indicando  "es mayor" o "es menor" según sea mayor o menor con respecto a N. 
    El proceso termina cuando el usuario acierta y mostrar el número de intentos.
     */
    public static void main(String[] args) {
        int contador = 0, aleatorio, numero;
        //Numero random entre 0-100
        aleatorio = (int) ((Math.random() * 101));
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("=== ADIVINAR NUMEROS ===\nIngrese numero: "));
            if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "ES MENOR");
            } else if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "ES MAYOR");
            }
            contador++;
        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "ADIVINISTASTE EL NUMERO: " + aleatorio + "\nNumero de intentos: " + contador);
    }
}
