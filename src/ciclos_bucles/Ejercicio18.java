/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio18 {
    /*
    Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro. Solo existen tres productos con precios.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int codigo, cantidadL, litrosArticulo = 0, facturaMayores = 0, opcion;
        float precioL = 1, facturaT = 0, factura;
        
        System.out.println("=== VENTA DE DESINFECTANTES ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("FACTURA: "+(i+1));
            System.out.print("Codigo ");
            codigo = Integer.parseInt(leer.nextLine());
            System.out.print("Litros vendidos: ");
            cantidadL = Integer.parseInt(leer.nextLine());
            do {                
                System.out.print("""
                               --- PRECIO POR LITRO ---
                               1.S/0.6 x litro
                               2.S/3 x litro
                               3.S/1.25 x litro
                               """);
                System.out.print("Indique opcion: ");
                opcion = Integer.parseInt(leer.nextLine());
                switch (opcion) {
                case 1 -> precioL = 0.6f;
                case 2 -> precioL = 3f;
                case 3 -> precioL = 1.25f;
                default -> System.out.println("< OPCION INVALIDA >");
            }
            } while (opcion<0 || opcion>3);
            factura = (precioL* cantidadL);
            facturaT+=factura;
            
            if (codigo==1) {
                litrosArticulo+=cantidadL;
            }
            if (factura>600) {
                facturaMayores++;
            }
        }
        System.out.println("\n=== REPORTE FINAL ===");
        System.out.println("Facturacion total: "+facturaT);
        System.out.println("Litros vendidos del articulo 1: "+litrosArticulo);
        System.out.println("Facturas mayores a S/600: "+facturaMayores);
    }
}
