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
public class Ejercicio17 {
    /*
    Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura:
    -código de articulo
    -cantidad vendida en litros y el precio por litro
    Se pide 5 facturas introducidas y piden: Facturación total, cantidad en litros vendidos del articulo 1 y cuantas facturas se emitieron de mas de S/600
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int codigo, cantidadL, litrosArticulo = 0, facturaMayores = 0;
        float precioL, facturaT = 0, factura;
        
        System.out.println("=== VENTA DE DESINFECTANTES ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("FACTURA: "+(i+1));
            System.out.print("Codigo ");
            codigo = Integer.parseInt(leer.nextLine());
            System.out.print("Litros vendidos: ");
            cantidadL = Integer.parseInt(leer.nextLine());
            System.out.print("Precio por litro: ");
            precioL = Float.parseFloat(leer.nextLine());
            
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
