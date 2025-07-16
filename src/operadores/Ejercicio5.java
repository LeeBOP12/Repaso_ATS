/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio5 {
    /*
    La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos de su 
    rendimiento académico: participación, primer examen parcial, segundo examen parcial y el examen final. Sabiendo que las 
    calificaciones anteriores entran a la calificación con ponderaciones de 10%, 25%, 25% y 40%. Hacer un programa que calcule
    e imprima la calificación final obtenida por un estudiante
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float np, p1, p2, pf, nf;
        
        System.out.println("==== CALIFICACIONES ====");
        System.out.print("Nota Participacion: ");
        np = Float.parseFloat(leer.nextLine());
        System.out.print("N. Primer Parcial: ");
        p1 = Float.parseFloat(leer.nextLine());
        System.out.print("N. Segundo Parcial: ");
        p2 = Float.parseFloat(leer.nextLine());
        System.out.print("N. Examen Final: ");
        pf = Float.parseFloat(leer.nextLine());
        
        np*= 0.10f;
        p1*= 0.25f;
        p2*= 0.25f;
        pf*= 0.40f;
        
        nf = np + p1 + p2 + pf;
        
        System.out.println("\n==== NOTA FINAL ====");
        System.out.println("Nota Final: "+nf);
    }
}
