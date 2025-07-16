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
public class Ejercicio4 {
    /*
    Una compañía de venta de carros usados, paga a su personal de ventas un salario de S/1000 mensuales, 
    mas una comisión de S/150 por cada carro vendido, mas el 5% del valor de la venta por carro. Cada mes el 
    capturista de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e 
    imprima el salario mensual de un vendedor dado. 
    (EN ESTE CASO COMO SI SOLO VENDIERA 3 CARROS POR DIA, AUN NO ESTAMOS EN BUCLES)
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float comisionC, porcentajeC, c1, c2, c3, salarioM;
        
        System.out.println("=== VENTA DE CARROS ====");
        System.out.print("Precio carro 1: ");
        c1 = Float.parseFloat(leer.nextLine());
        System.out.print("Precio carro 2: ");
        c2 = Float.parseFloat(leer.nextLine());
        System.out.print("Precio carro 3: ");
        c3 = Float.parseFloat(leer.nextLine());
        
        porcentajeC = (float) ((c1*0.05)+ (c2*0.05) + (c3*0.05));
        comisionC = 150 * 3;
        salarioM = 1000 + porcentajeC + comisionC;
        
        System.out.println("\n==== SALARIO MENSUAL ====");
        System.out.println("Salario Mensual: "+salarioM);
    }
}
