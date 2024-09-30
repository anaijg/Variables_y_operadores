package ejerciciosbasicos1;

import java.util.Scanner;

/*
Imagina que eres un gerente de recursos humanos en un restaurante y necesitas contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares sobre los candidatos, concretamente 4 campos (variables): nombre, edad, años de experiencia, preferencia de cocina. Escribe un programa que lea todas las palabras (o números) una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE COCINA>".
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        int experiencia = sc.nextInt();
        // AVISO: CUANDO UTILIZAS nextInt() y a continuación nextLine(), falla
        // es como si que quedara pillado un \n
        // se apaña así: introduciendo un nextLine() suelto
        sc.nextLine();
        String preferenciaDeCocina = sc.nextLine();

        // ahora imprimimos lo que nos dice:
        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " + experiencia + " de experiencia, está completo. Nos  comunicaremos con usted si necesitamos alguien que cocine comida " + preferenciaDeCocina + ".");
    }
}
