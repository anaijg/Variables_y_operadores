package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente.
Escribe un programa que pregunte por el número de ardillas y nueces, y, a continuación, calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // pedimos el número de ardillas y el número de nueces
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cuántas ardillas estamos hablando?");
        int ardillas = sc.nextInt();
        System.out.println("¿Y cuántas nueces han encontrado?");
        int nueces = sc.nextInt();
        // tocan a:
        int reciben = nueces / ardillas;
        int sobran = nueces % ardillas;
        System.out.println("Cada ardilla recibirá " + reciben + " nueces y sobran " + sobran + ".");
    }
}
