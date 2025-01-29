package operadores.porcentajes;

import java.util.Scanner;

/*
Un alumno desea saber cual será su nota final en un módulo. Dicha calificación se compone de los siguientes porcentajes:

El 55% se obtiene del promedio de la nota de las tres evaluaciones..
El 30% se obtiene de la nota en un examen final.
El 15% se obtiene de de la calificación de un trabajo final.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        // 1) necesitamos saber la nota en cada evaluación y calcular el promedio
        // por variar, las metemos en la misma línea
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota de las tres evaluaciones (en número entero) separadas por un espacio");
        String[] notas = scanner.nextLine().trim().split(" "); // ej ["7", "8", "6"]
        //int suma = notas[0] + notas[1] + notas[2]; -> esto peta porque el array contiene Strings, no int. Para hacer casting de números que son String a int (o a double, o a long...)
        // IMPORTANTE: para convertir un entero String a int utilizamos Integer.parseInt("numero")
        int primeraEv = Integer.parseInt(notas[0]); // "7" -> 7
        int segundaEv = Integer.parseInt(notas[1]); // "7" -> 7
        int terceraEv = Integer.parseInt(notas[2]); // "7" -> 7
        double promedio = (double) (primeraEv + segundaEv + terceraEv) / (double) notas.length;
        // 2) pedimos nota examen final
        System.out.print("Nota examen final: ");
        double examenFinal = scanner.nextDouble();
        // 3) pedimos nota trabajo final
        System.out.print("Nota trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        // con esto, aplicamos los porcentajes
        double notaFinal = promedio * (55.0 / 100.0) + examenFinal * (30.0 / 100.0) + trabajoFinal * (15.0 / 100.0);
        System.out.printf("Nota final: %.2f", notaFinal);



    }
}
