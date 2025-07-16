/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio16_2 {
    /*
    Hacer la tabla de multiplicar del 1-12 usando lso 3 bucles
    */
    public static void main(String[] args) {
        int i=1, j=1;
        
        //WHILE
        System.out.println("=== USO WHILE ===");
        while (i<=12) { 
            j=1;
            while (j<=12) {                
                 System.out.println(i+" x "+j+" = "+(i*j));
                 j++;
            }
            i++;
        }
        //DO WHILE
        System.out.println("=== USO DO WHILE ===");
        int h=1, k=1;
        do {            
            do {                
                System.out.println(h+" x "+k+" = "+(h*k));
                k++;
            } while (k<=12);
            k=1;
            h++;
        } while (h<=12);
        //USO FOR
        System.out.println("=== USO DE FOR ===");
        for (int l = 1; l <= 12; l++) {
            for (int m = 1; m <= 12; m++) {
                System.out.println(l+" x "+m+" = "+(l*m));
            }
        }
    }
}
