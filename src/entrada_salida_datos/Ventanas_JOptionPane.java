/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrada_salida_datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ventanas_JOptionPane {
    /*
    JOptionPane = Ventanas emergentes tipo String (Ya no es necesario el "Scanner"
    
    JOptionPaneShowInputDialog = Inputo para ingresar datos (input)
    JOptionPaneShowMessageDialog = Mostrar datos
    
    */
    public static void main(String[] args) {
        int numero;
        String cadena;
        char letra;
        float decimal;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese entero: "));
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese decimal: "));
        cadena = JOptionPane.showInputDialog("Ingrese cadena: ");
        letra = JOptionPane.showInputDialog("Ingrese Letra ").charAt(0);
        
        //Probando en una sola porque tambien puede ser en varias ventanas
        JOptionPane.showMessageDialog(null, "==== RESULTADOS INGRESADOS ====\nEntero: "+numero +"\nDecimal: "+decimal +"\nCadena: "+cadena +"\nLetra: "+letra);
        
        
        
    }
}
