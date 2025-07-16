/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

/**
 *
 * @author Lee Brandon
 */
public class Bucle_Do_While {
    /*
    do while : hacer minetras
    
    do {
    INSTRUCCIONES
    } while(condicion);
    
    Nota: Se ejecutan las instrucciones al menos una vez
    */
    public static void main(String[] args) {
        int inicio=10;
        
        do {
            System.out.println(inicio);
            inicio++;
        }while(inicio<=10);
    }
}
