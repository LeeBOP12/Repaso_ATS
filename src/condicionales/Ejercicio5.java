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
public class Ejercicio5 {
    /*
    Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
    -Si trabaja 40 horas o menos se le paga S/16 por hora
    -Si trabaja mas de 40 horas se le paga S/16 por cada una de las primeras 40 horas y S/20 por cada hora extra.
    */
    public static void main(String[] args) {
        int horasT; 
        float pago;
        
        horasT = Integer.parseInt(JOptionPane.showInputDialog("=== SALARIO POR HORAS ===\nIngrese horas trabajadas"));
        
        if (horasT<40) {
            pago = horasT*16;
        }else{
            pago = (16*40) + ((horasT-40)*20);
        }
        JOptionPane.showMessageDialog(null, "Salario total: "+pago);
    }
}
