/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Llenar_Arreglo {
    /*
    
    */
    public static void main(String[] args) {
        //Podemos definir el arreglo desde el principio y luego darle el tamaño ----> int arreglo[]
        Scanner leer = new Scanner(System.in);
        int elementos;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de arreglo: "));
        
        //Ponemos tamaño del arreglo
        int[] arreglo = new int[elementos];
        //Llenamosa rreglo CON FOR
        System.out.println("=== LLENAR ARREGLO ===");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1)+".Numero: ");
            arreglo[i] = Integer.parseInt(leer.nextLine());
        }
        //Mostramos con mismo for
        System.out.println("=== NUMEROS INGRESADOS ===");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Numeros: "+arreglo[i]);
        }
    }
}
