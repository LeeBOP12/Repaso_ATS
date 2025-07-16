/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author Lee Brandon
 */
public class IncrementoDecremento {
    /*
    ++ = aumentar en 1
    -- = decrementar en 1
    
    NOTA : Verificar i se pone como prefijo o subfijo en las variables
    */
    
    
    public static void main(String[] args) {
        int x=5, y;
        
        y = x++; //Asignamos el valor actual de x y luego aumentamos x
        System.out.println("Valor de Y: "+y);
        int a=5, b;
        
        b = --a; //Restamos 1 y luego asignamos el valor de a
        System.out.println("Valor de B: "+b);
    }
}
