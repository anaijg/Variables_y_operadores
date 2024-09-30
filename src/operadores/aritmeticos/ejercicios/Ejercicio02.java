package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribir un programa en el cual se piden cuatro números y se calcule e imprima la suma de los dos primeros y el producto del tercero y el cuarto.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        // se piden cuatro números por teclado
        Scanner sc = new Scanner(System.in);
        // se piden cuatro números
        System.out.println("Introduce cuatro números, uno en cada línea: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        int numero4 = sc.nextInt();

        System.out.println("La suma de los dos primeros es: " + (numero1 + numero2));
        System.out.println("El producto del tercero y el cuarto es : " + (numero3 * numero4));
    }
}
