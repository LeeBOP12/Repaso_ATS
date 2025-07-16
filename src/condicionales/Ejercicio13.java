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
public class Ejercicio13 {
    /*
    Hacer un programa que simule un cajero automático con un saldo inicial de S/1000, con el siguiente menú de opciones:
    
    1.Ingresar dinero a la cuenta
    2.Retirar dinero de la cuenta
    3.Salir
    */
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, retiro, saldoActual;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              === CAJERO AUTOMATICO ===
                                                              1.Ingresar dinero a la cuenta
                                                              2.Retirar dinero de la cuenta
                                                              3.Salir
                                                              """));
        switch (opcion) {
            case 1 -> {
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("--- INGRESAR DINERO ---\nMonto a ingresar: "));
                saldoActual = ingreso + saldo_inicial;
                JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoActual);
            }
            case 2 -> {
                retiro = Float.parseFloat(JOptionPane.showInputDialog("--- RETIRAR DINERO ---\nMonto a retirar"));
                if (retiro>saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente: "+saldo_inicial);
                } else {
                    saldoActual = saldo_inicial-retiro;
                    JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoActual);
                }
            }
            case 3 -> JOptionPane.showMessageDialog(null, "Gracias por su visita");
            default -> JOptionPane.showMessageDialog(null, "< OPCION INVALIDA >");
        }
    }
}
