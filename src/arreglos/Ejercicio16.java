/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio16 {
    /*
    Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) 
    está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar 
    al final:
    -La nota media del grupo en cada trimestre
    -La media del alumno que se encuentra en la posición N (N se lee por teclado).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos array de lso 3 trimestres con 5 alumnos cada uno
        float primerT[] = new float[5];
        float segundoT[] = new float[5];
        float tercerT[] = new float[5];
        float sumaT1 = 0, sumaT2 = 0, sumaT3 = 0;
        //Llenamos los arrays de trimestres con las notas
        System.out.println("=== NOTAS POR TRIMESTRE ===");
        System.out.println("I TRIMESTRE: ");
        for (int i = 0; i < primerT.length; i++) {
            do {
                System.out.print((i + 1) + ".Alumno: ");
                primerT[i] = Float.parseFloat(leer.nextLine());
                if (primerT[i] < 0 || primerT[i] > 20) {
                    System.out.println("Nota fuera de rango [0 - 20]");
                }
            } while (primerT[i] < 0 || primerT[i] > 20);
            sumaT1+=primerT[i];
        }
        System.out.println("II TRIMESTRE: ");
        for (int i = 0; i < segundoT.length; i++) {
            do {
                System.out.print((i + 1) + ".Alumno: ");
                segundoT[i] = Float.parseFloat(leer.nextLine());
                if (segundoT[i] < 0 || segundoT[i] > 20) {
                    System.out.println("Nota fuera de rango [0 - 20]");
                }
            } while (segundoT[i] < 0 || segundoT[i] > 20);
            sumaT2+=segundoT[i];
        }
        System.out.println("III TRIMESTRE: ");
        for (int i = 0; i < tercerT.length; i++) {
            do {
                System.out.print((i + 1) + ".Alumno: ");
                tercerT[i] = Float.parseFloat(leer.nextLine());
                if (tercerT[i] < 0 || tercerT[i] > 10) {
                    System.out.println("Nota fuera de rango [0 - 20]");
                }
            } while (tercerT[i] < 0 || tercerT[i] > 20);
            sumaT3+=tercerT[i];
        }
        //Pedimos poscion del alumno y sacamos su media
        int posicion; 
        float mediaAlumno=0;
        do {            
            System.out.print("Posicion de alumno a sacar media: ");
            posicion = Integer.parseInt(leer.nextLine());
        } while (posicion<1 || posicion>5);
        posicion--;
        mediaAlumno = (primerT[posicion] + segundoT[posicion] + tercerT[posicion])/3;
        
        //Mostramos media de las notas de los alumnos por trimestre
        System.out.println("=== MEDIA DE CADA TRIMESTRE ===");
        System.out.println("Media primer trimestre: "+sumaT1/5);
        System.out.println("Media segundo trimestre: "+sumaT2/5);
        System.out.println("Media tercer trimestre: "+sumaT3/5);
        System.out.println("Media de alumno indicado: "+mediaAlumno);
    }
}
