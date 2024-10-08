package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida un número de dos cifras y muestre sus cifras invertidas..
 Ejemplo, si se introduce 23 que muestre 32.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras");
        int numero = sc.nextInt();
        // se puede hacer en una línea, pero para mayor claridad separamos las dos cifras en variables
        int decenas = numero / 10;
        int unidades = numero % 10;
        // ahora creamos el número invertido
        int numeroInvertido = unidades * 10 + decenas;
        System.out.println(numeroInvertido);
    }
}
