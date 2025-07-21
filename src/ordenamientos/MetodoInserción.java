/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class MetodoInserción {
    /*
    Metodo Inserccion:
    COMPARAR TODOS LOS ELEMENTOS DE LA IZQUIERDA Y CAMBIARLOS SI ES NECESARIO
        
    FORMA
    numereroIzquierrda > numeroActual (CAMBIO)
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros[], tamaño, pos, aux;
        //Definimos tamaño
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digite tamaño de arreglo: "));
        //Asignamos tamañp
        numeros = new int[tamaño];
        
        //Llenamos arreglo
        System.out.println("=== INGRESE NUMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+".Numero: ");
            numeros[i] = Integer.parseInt(leer.nextLine());
        }
        //ORDENAMIENTO POR INSERCCIOn
        for (int i = 0; i < numeros.length; i++) {
            //Posicion de array
            pos=i;
            //Gurdamos elemento
            aux= numeros[i];
            //Validamos desde la posicion 2 y verificamos que ssea mayor o no
            while (pos>0 && numeros[pos-1]>aux) {            
                //Verificamos condicion
                numeros[pos] = numeros[pos-1];
                //Validamos hasta la posicion correcta
                pos--;
            }
            //Asignmaos el valor guardado
            numeros[pos] = aux;
        }
        //ARREGLO ORDENADO CRECIENTEMENTE
        System.out.println("\n=== ARRAY ORDENADO CRECINETEMENTE ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        //ARREGLO ORDENADO DECRECIENTEMENTE
        System.out.println("\n=== ARRAY ORDENADO DECRECIENTEMENTE ===");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
}
