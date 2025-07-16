/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Lee Brandon
 */
public class Bucle_ForEach {
    /*
    FOR EACH : Bucle for mejorado, su objetivo es LISTAR TODO LOS ELEMENTOS DE UN ARREGLO, TODOS
    
    FORMA ---> for(tipo_dato nombre : nombreArray) {
                   LLAMAR o MOSTRAR "nombre"
               }
    */
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pepe", "Lee"};
        
        System.out.println("=== NOMBRES DE ARREGLO ===");
        for (String nombre : nombres) {
            System.out.println("Nombre: "+nombre);
        }
    }
}
