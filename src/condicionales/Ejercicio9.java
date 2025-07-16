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
public class Ejercicio9 {
    /*
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días.
     */
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("=== VALIDAR DIA, MES Y AÑO ===\nIngrese dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año: "));

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "FECHA CORRECTA");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta: Año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha Incorrecta: Mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta: Dia incorrecto");
        }
    }
}
