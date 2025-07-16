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
public class Ejercicio4 {
    /*
    Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han introducido.
    */
    public static void main(String[] args) {
        int numero, cont=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("=== NUMEROS ===\nIngrese numero: "));
        
        while (numero>=0) {    
            cont++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        }
        JOptionPane.showMessageDialog(null, "Saliendo.....\nNumeros ingresados: "+cont);
    }
}
