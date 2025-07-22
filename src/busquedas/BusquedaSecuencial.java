/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class BusquedaSecuencial {
    /*
    RECORRIDO DEL ARRAY HASTA QUE SE ENCUENTRE EL ELEMENTO, RECORRIENDO POSICION POR POSICION (ARREGLOS DESORDENADOS)
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definimos elementos de arreglo
        int numeros[] = {1,5,6,9,10};
        int dato;
        boolean encontrado=false;
        //Pedimos dato a buscar
        dato = Integer.parseInt(JOptionPane.showInputDialog("=== BUSCAR DATO ===\nNumero a buscar: "));
        //BUSQUEDA SECUENCIAL
        int i=0;
        //Hasta que se encuentre el dato en TODA LA LISTA SE ENECUENTRE O NO
        while (i<numeros.length && encontrado==false) {            
            if (numeros[i] == dato) {
                encontrado=true;
            }
            i++;
        }
        //Mostramos resultado
        if (encontrado) {
            System.out.println("Numero encontrado en la posicion: "+(i-1));
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}
