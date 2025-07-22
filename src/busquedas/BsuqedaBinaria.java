/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class BsuqedaBinaria {
    /*
    RECORRIDO EN UN ARRAY ORDENADO CRECIENTEMENTE, DE UNA MANERA RAPIDA PERO DEBEN ESTAR ORDENADOS
    */
    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 5};  // Debe estar ORDENADO
        int dato;  // Número a buscar
        boolean encontrado = false;
        //Pedimos numero a buscar
        dato = Integer.parseInt(JOptionPane.showInputDialog("=== BUSCAR DATO ===\nIngrese numero a buscar: "));
        
        // Límites de búsqueda
        int inferior = 0;
        int superior = arreglo.length - 1;  // superior = 4 (último índice)

        while (inferior <= superior) {
            int mitad = (inferior + superior) / 2;  // calculamos la mitad
            
            if (arreglo[mitad] == dato) {
                encontrado = true;
                System.out.println("Dato encontrado en la posición: " + mitad);
                break;
            } else if (arreglo[mitad] < dato) {
                // El valor está en la parte derecha
                inferior = mitad + 1;
            } else {
                // El valor está en la parte izquierda
                superior = mitad - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Dato no encontrado.");
        }
    }
}
