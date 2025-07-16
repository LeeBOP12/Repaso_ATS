/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipo_datos;

/**
 *
 * @author Lee Brandon
 */
public class DatosPrimitivos {
    /*
    SALTO DE LINEA O ESPACIO : "\n" o "\t"
    CONCADENAR : +(nonbre variable)
    
    ENTEROS : (definir l para longo
    byte :  8 bits (-128 - 127)
    short : 16 bits  (-32.768 -  32767)
    int : 32 bits (-2 147 483 648 - 2 147 483 647)
    long : 64 bits (-9 223 372 036 854 775 808 - 9 223 372 036 854 775 808)
    
    DECIMALES
    float : 32 bits (poner la final f)
    doublé : 64 bits
    
    LETRAS/CADENAS
    char : letra en ' '
    String : caracteres en " "
    
    BOOLEANOS :
    boolean : verdadero o falso
    */
    
    public static void main(String[] args) {
        byte pequeño = 127;
        short corto = 32767;
        int entero = 2147483647;
        long largo = 9223372854775807l;
        
        float decimalC = 4.5f;
        double decimal = 5605.4;
        
        char letra = 'A';
        String cadena = "HOLA MUNDO :D";
        
        boolean decicion = true;
        boolean decision2 = false;
        
        System.out.println(" ==== ENTEROS ====");
        System.out.println("Pequeño : "+pequeño);
        System.out.println("Corto: "+corto);
        System.out.println("Entero: "+entero);
        System.out.println("Largo: "+largo);
        System.out.println("\n ==== DECIMAL ====");
        System.out.println("Decimal Corto: "+decimalC);
        System.out.println("Decimal Largo: "+decimal);
        System.out.println("\n ==== LETRAS ====");
        System.out.println("Letra: "+letra);
        System.out.println("Cadena: "+cadena);
        System.out.println("\n ==== BOOLEANOS ====");
        System.out.println("Decicion 1 : "+decicion);
        System.out.println("Decision 2 : "+decision2);
        
        
    }
}
