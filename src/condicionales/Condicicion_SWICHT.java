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
public class Condicicion_SWICHT {
    /*
    FORMA: Condicion Multiple
    
    switch (condicion) {
    case 1 : Intruccion1; 
             break;
    case 2 : Intruccion2; 
             break;
    case 3 : Intruccion3; 
             break;
    ....
    case n : Intruccionn; 
             break;
    }
    */
    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero entre [1 - 5]: "));
        
        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "El numero es 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "EL numero es 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "EL numero es 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "EL numero es 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "EL numero es 5");
                break;    
            default:
                JOptionPane.showMessageDialog(null, "EL NUMERO NO ESTA DENTRO DE [1 - 5]");
        }
    }
}
