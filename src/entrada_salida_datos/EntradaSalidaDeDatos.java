/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrada_salida_datos;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class EntradaSalidaDeDatos {
    /*
    Uso de la libreria "Scanner"
    fomra: Scanner nombre = new Scanner(System.in)M
    
    nombre.nextInt (guardar entero)
    nombre.nextDouble
    ------------------------------------------------------------
    
    Integer.parseInt(nombre.nextLine) --> Convierte a entero y lo guarda (FORMA CORRECTA)
    Double.parseDouble
    .....
    Etc.
    -----------------------------------------------------------
    leer.nextLine (cadena)
    leer.nextLine.charArt(0) (primera letra ingresada)
    */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int numero;
        String cadena;
        char letra;
        
        System.out.println("=== INGRESE DATOS ====");
        System.out.print("Numero: ");
        numero = Integer.parseInt(leer.nextLine());
        System.out.print("Cadena: ");
        cadena = leer.nextLine();
        System.out.print("Letra: ");
        letra = leer.nextLine().charAt(0);
        
        System.out.println("\n=== MOSTRAR DATOS ====");
        System.out.println("Numero: "+numero);
        System.out.println("Cadena: "+cadena);
        System.out.println("Letra; "+letra);
    }
}
