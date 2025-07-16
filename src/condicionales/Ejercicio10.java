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
public class Ejercicio10 {

    /*
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
    
    28 : Febrero (2)
    30 : Abril, Junio, Setiembre y Noviembre (4,6,9,11)
    31 : Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre (1,3,5,7,8,10,12)
     */
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("=== VALIDAR DIA, MES Y AÑO ===\nIngrese dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año: "));

        if (año != 0) {
            if (mes >= 1 && mes <= 12) {
                if ((mes == 2 && dia >= 1 && dia <= 28)
                        || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30)
                        || ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31)) {
                    JOptionPane.showMessageDialog(null, "Fecha Correcta :D");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha Incorrecta: Día incorrecto del mes :v");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha Incorrecta: Mes inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta: Año inválido");
        }
    }
}
