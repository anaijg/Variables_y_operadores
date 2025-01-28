package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/**
 * Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal.
 *
 * @author AnaIJim
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        // leemos 4 valores numéricos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1ª ev:");
        double primera = scanner.nextDouble();
        System.out.print("Nota 2ª ev:");
        double segunda = scanner.nextDouble();
        System.out.print("Nota 3ª ev:");
        double tercera = scanner.nextDouble();

        // calculamos la media
        double media = (primera + segunda + tercera) / 3;
        System.out.printf("Nota final: %.1f", media);


    }
}
