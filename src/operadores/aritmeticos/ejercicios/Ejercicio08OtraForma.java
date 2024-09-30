package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida un número de dos cifras y muestre sus cifras invertidas..
 Ejemplo, si se introduce 23 que muestre 32.
 */
public class Ejercicio08OtraForma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras");
        int numero = sc.nextInt();
        // se puede hacer en una línea, pero para mayor claridad separamos las dos cifras en variables

        System.out.printf("numero %d invertido es: %d", numero, (numero % 10 * 10 + numero / 10)); // %d quiere decir que ahí va un número entero
    }
}
