/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipo_datos;

/**
 *
 * @author Lee Brandon
 */
public class DatosNoPrimitivos {
    /*
    DATOS PRIMITIVOS : Permiten almacenr NULL y aplicar funciones en la misma a lponer "."
    
    Short
    Integere
    Float
    ....
    (Agregar Primera Letra Mayuscula), a excepcion del char que es Character
    */
    
    public static void main(String[] args) {
        Integer entero = null;
        Double decimal = 50.51;
        Character letra = 'A';
        String cadena = "AVION QUE VUELA";
        
        System.out.println("=== MOSTRAR ===");
        System.out.println("Entero: "+entero);
        System.out.println("Decimal: "+decimal);
        System.out.println("Letra: "+letra);
        //Cadena minuscula
        System.out.println("Cadena: "+cadena.toLowerCase());
    }
}
