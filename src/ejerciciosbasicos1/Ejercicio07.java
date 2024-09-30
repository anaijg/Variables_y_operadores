package ejerciciosbasicos1;

import java.util.Scanner;

/*
Escribe un programa que lea tres cadenas de texto y las muestre en orden inverso, cada una en una nueva línea.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        // para introducir datos por teclado, tenemos que "crear" un Scanner
        // siempre se hace de la misma forma:
        Scanner sc = new Scanner(System.in);
        // ahora vamos a introducir una palabra por el teclado, y la guardamos en la variable palabra1
        String palabra1 = sc.nextLine(); // aquí se queda esperando hasta que escribimos algo y pulsamos Enter
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();

        // ahora tenemos que imprimir las palabras en orden inverso a como han entrado
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra1);
    }
}
