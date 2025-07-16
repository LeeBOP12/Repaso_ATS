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
public class OperadorTernario {
    /*
    Es ocmo un if - else
    FORMA --->  condicion ? verdadero : falso
    
    Ejemplo : Pedir un numero y indicar si es par o no
    */
    public static void main(String[] args) {
        int numero;
        String mensaje;
        
       numero = Integer.parseInt(JOptionPane.showInputDialog("=== NUMERO PAR O IMPAR ===\nIngrese numero: "));
       
       mensaje = numero%2==0 ? "Par" : "Impar";
       
       JOptionPane.showMessageDialog(null, "El numero es "+mensaje);
    }
}
