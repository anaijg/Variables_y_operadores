package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida un número de dos dígitos e imprima las decenas.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        // damos por bueno que el número que entra tiene dos dígitos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos dígitos: ");
        int numero = sc.nextInt();
        // para extraer las decenas dividimos por 10
        System.out.println(numero / 10);



    }
}
