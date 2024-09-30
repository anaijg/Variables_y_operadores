package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:

((n + 1) * n + 2) * n + 3
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        // traducción: entrada estándar = teclado
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Resultado:" + (((n + 1) * n + 2) * n + 3));
        sc.close();
    }
}
