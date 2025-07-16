/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author Lee Brandon
 */
public class OperadorMath {

    /*
    CLASE MATH = funciona directamente con DOUBLE luego se puede convertir en parentesis (tipo de dato)
    
    abs(x): Devuelve el valor absoluto de x.
    ceil(x): Devuelve el entero más pequeño que es mayor o igual a x.
    floor(x): Devuelve el entero más grande que es menor o igual a x.
    max(x, y): Devuelve el mayor de x e y.
    min(x, y): Devuelve el menor de x e y.
    pow(x, y): Devuelve x elevado a la potencia de y.
    random(): Devuelve un número aleatorio entre 0 y 1.
    round(x): Devuelve el entero más cercano a x.
    sqrt(x): Devuelve la raíz cuadrada de x.
     */
    public static void main(String[] args) {
        double raizC, potencia, random, redondeo;
        raizC = Math.sqrt(36.67);
        potencia = Math.pow(5, 4);
        random = (int) (100*Math.random()); //Numero randon de (0-100)
        redondeo = Math.round(4.50);
        
        System.out.println("==== RESULTADOS MATH ====");
        System.out.println("Raiz Cuadrada: " + raizC);
        System.out.println("Potencia: " + potencia);
        System.out.println("Numero random: "+random);
        System.out.println("Numero redondeado: "+redondeo);
    }
}
