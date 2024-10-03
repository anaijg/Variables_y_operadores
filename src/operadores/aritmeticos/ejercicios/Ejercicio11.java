package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Realiza un programa que calcule la longitud de una circunferencia si nos dan el radio por teclado
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        double longitud = 2 * Math.PI * radio;
        //System.out.println("longitud = " + longitud);
        System.out.printf("longitud = %.2f", longitud);
    }
}
