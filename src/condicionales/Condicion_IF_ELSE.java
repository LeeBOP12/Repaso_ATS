/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Condicion_IF_ELSE {
    /*
    FORMA :
    if(condicion){
    Instruccion1
    }else{
    Instruccion2
    }
    
    OPERADORES LOGICOS:
    < , > : mayor o menor
    <= , >= : menor igual o mayor igual
    == : igual
    != : difernete
    
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO: "));
        
        if (numero!=5) {
            JOptionPane.showMessageDialog(null, "EL NUMERO NO ES 5");
        }else {
            JOptionPane.showMessageDialog(null, "EL NUMERO ES 5");
        }
    }
}
