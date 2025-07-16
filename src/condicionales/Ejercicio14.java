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
public class Ejercicio14 {

    /*
    Hacer un programa que pase de kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
     */
    public static void main(String[] args) {
        float masa;
        int opcion;

        masa = Float.parseFloat(JOptionPane.showInputDialog("=== CONVERSION DE KG ===\nMasa en kg: "));

        if (masa < 0) {
            JOptionPane.showMessageDialog(null, "< ERROR MASA NEGATIVA >");
            return;
        }
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                            --- INDIQUE OPCION ---
                                                            1.Convertir decagramo (dag)
                                                            2.Convertir a gramos (g)
                                                            3.Convertir a miligramos (mg)
                                                            4.Salir
                                                            Indique una opcion:
                                                              """));
        switch (opcion) {
            case 1 -> {
                masa *= 100;
                JOptionPane.showMessageDialog(null, "Decagramos: " + masa);
            }
            case 2 -> {
                masa *= 1000;
                JOptionPane.showMessageDialog(null, "Gramos: " + masa);
            }
            case 3 -> {
                masa *= 1000000;
                JOptionPane.showMessageDialog(null, "Miligramos: " + masa);
            }
            case 4 ->
                JOptionPane.showMessageDialog(null, "< FIN DE CONVERSION >");
            default ->
                JOptionPane.showMessageDialog(null, "< OPCION INVALIDA >");
        }
    }
}
