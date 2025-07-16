/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Lee Brandon
 */
public class Arreglos_Unidimensionales {

    /*
    Arreglos : Estructura de datos o coleccion de datos de UN SOLO TIPO DATO y que se define su tamaño desde el principio,
    no se puede modificar durante la ejecucion, SIEMPRE INICIAN CON LA POSICION "0";
    
    Arreglo Unidimensional ---> tipo_dato nombre[] = new tipo_dato[tamaño];
                                tipo_dato[] nombre = new tipo_dato[tamaño];
                                
     */
    public static void main(String[] args) {
        int[] numeros = new int[3];

        //Llenado manual
        numeros[0] = 5;
        numeros[1] = 6;
        numeros[2] = 7;
        
        //Llenado manual 2
        // inr[] numeros = new int{1,2,3};
        
        //Mostrar manual
        /*System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);*/
        
        //Mostrar bucles
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
