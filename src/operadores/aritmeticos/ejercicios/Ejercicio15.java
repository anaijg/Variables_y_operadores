package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Realizar un programa que lea cuatro valores numéricos e imprima su suma y su media. Ten en cuenta que la media puede contener decimales.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // como el resultado puede tener decimales, declaro las variables como double desde el principio
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();
        double numero4 = sc.nextDouble();

        double suma = numero1 + numero2 + numero3 + numero4;
        System.out.println("Suma = " + suma);
        double media = suma / 4.0;
        System.out.println("Media = " + media);
    }
}
