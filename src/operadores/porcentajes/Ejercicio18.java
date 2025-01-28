package operadores.porcentajes;

import java.util.Scanner;

/**
 * @author AnaIJim
 *
 * Realiza un programa que pida un número y un porcentaje, y a) Calcule y muestre ese número incrementado en ese porcentaje. b) Calcule y muestre ese número decrementado en ese porcentaje.
 *
 * Por ejemplo: si se introduce 10 y 20, el resultado es 12 y 8.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.print("\nIntroduce porcentaje: ");
        double porcentaje = scanner.nextDouble();
        double cantidadPorcentaje = numero * (porcentaje / 100);
        // cómo calcular un porcentaje de un número: numero * (porcentaje / 100)
        // si quiero incrementar el número en ese porcentaje, se lo sumo al número
        // si quiero decrementar el número en ese porcentaje, se lo resto al número
        System.out.print("\na) Número incrementado en un " + porcentaje + "%: " + (numero + cantidadPorcentaje));
        System.out.print("\nb) Número decrementado en un " + porcentaje + "%: " + (numero - cantidadPorcentaje));



        }
}
