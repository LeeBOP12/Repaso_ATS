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
public class Ejercicio12 {
    /*
    Pedir una nota de 0 a 10 y mostrarla de la forma: insuficiente, suficiente, bien, notable y sobresaliente.
     */
    public static void main(String[] args) {
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("=== NOTAS ====\nIngrese la nota"));

        if (nota < 0 || nota > 10) {
            JOptionPane.showMessageDialog(null, "Nota Invalida [0-10]");
        } else if (nota <= 2) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota <=4) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (nota <=6) {
            JOptionPane.showMessageDialog(null, "Bien");
        } else if (nota <=8) {
            JOptionPane.showMessageDialog(null, "Notable");
        } else {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
    }
}
