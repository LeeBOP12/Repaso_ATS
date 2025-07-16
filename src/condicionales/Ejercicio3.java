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
public class Ejercicio3 {

    /*
    Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayuscula
     */
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("INGRESE LETRA: ").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "ES LETRA MAYUSCULA");
        } else if (Character.isLowerCase(letra)) {
            JOptionPane.showMessageDialog(null, "ES LETRA MINUSCULA");
        } else {
            JOptionPane.showMessageDialog(null, "NO ES UNA LETRA");
        }

    }
}
