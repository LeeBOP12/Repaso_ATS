/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio14 {
    /*
    Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores a S/1000.
    */
    public static void main(String[] args) {
        int sueldo, contMayores=0, sumaT=0;
        
        for (int i = 0; i < 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("=== SUELDOS MAYORES A S/1000 ===\nIngrese sueldo: "));
            sumaT+=sueldo;
            if (sueldo>1000) {
                contMayores++;
            }
        }
        System.out.println("=== RESULTADOS ===");
        System.out.println("Suma de sueldos: "+sumaT);
        System.out.println("Sueldos mayores a S/1000: "+contMayores);
    }
}
