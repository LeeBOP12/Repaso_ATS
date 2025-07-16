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
public class Ejercicio11 {

    /*
    Construir un programa que simule el funcionamiento de una calculadora que pueda realizar las 
    cuatro operaciones básicas (suma, resta, producto y división) con valores numéricos enteros. 
    El usuario debe especificar la operación con el primer carácter del primer parámetro de la linea 
    de comandos: S o S para suma, R o r para la resta, P,p, M o m para el producto y D o d para la división.
     */
    public static void main(String[] args) {
        float num1, num2, resultado;
        char op;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("=== CALCULADORA BASICA ===\nPrimer numero: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo numero: "));
        
        op = JOptionPane.showInputDialog("=== INDIQUE OPERACION ===\n1.Suma\n2.Resta\n3.Producto\n4.Division").charAt(0);
        
        switch (op) {
            case 'S', 's':
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Suma: " + resultado);
                break;
            case 'R', 'r':
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Resta: " + resultado);
                break;
            case 'M', 'm', 'P', 'p':
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Producto: " + resultado);
                break;
            case 'D', 'd':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Division: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion invalida [S,s, R, r, M, m, P, p, D, d]");
        }
    }
}
