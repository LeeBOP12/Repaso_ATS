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
public class Ejercicio7 {
    /*
   Construir un programa que, dado un numero total de horas, devuelve el numero de semanas, días y horas 
    equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int horasT, semanas, dias, horas, resto;

        System.out.println("==== SEMANAS, DÍAS Y HORAS ====");
        System.out.print("Ingrese número de horas: ");
        horasT = Integer.parseInt(leer.nextLine());

        semanas = horasT / 168;
        resto = horasT % 168;
        dias = resto / 24;
        horas = resto % 24;

        System.out.println("\n#Semanas: " + semanas);
        System.out.println("#Días: " + dias);
        System.out.println("#Horas Restantes: " + horas);
        
    }
}
