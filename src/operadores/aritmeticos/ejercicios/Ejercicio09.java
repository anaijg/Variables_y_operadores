package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que lea un número de tres cifras y muestre el número invertido. Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si introducimos 976, el programa debe mostrar 679.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt(); // 976
        // separo las centenas dividiendo por 100
        int centenas = numero / 100; // 9
        // el resto son decenas y unidades
        int resto = numero % 100; // 76
        // ahora del resto separo decenas y unidades dividiendo por 10
        int decenas = resto / 10; // 7
        int unidades = resto % 10; // 6

        // ahora las muestro en orden inverso
        System.out.println(unidades + "" + decenas + "" + centenas ); // al poner las "" ya considera todo como String y no suma los números
    }
}
