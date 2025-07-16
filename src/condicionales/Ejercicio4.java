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
public class Ejercicio4 {
    /*
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los S/300. 
    ¿Cuál será la cantidad que pagara una persona por su compra?.
    */
    public static void main(String[] args) {
        float precio;
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("Precio de Compra:"));
        
        if (precio<=300) {
            JOptionPane.showMessageDialog(null, "Cuenta a pagar: "+precio);
        } else {
            precio*=0.8;
            JOptionPane.showMessageDialog(null, "Cuenta a pagar: "+precio);
        }
    }
}
