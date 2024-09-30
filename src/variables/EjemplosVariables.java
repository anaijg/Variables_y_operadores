package variables;

import java.util.Scanner;

public class EjemplosVariables {
    public static void main(String[] args) {
        System.out.println("***** TIPOS DE VARIABLES *****");
        System.out.println("Números ENTEROS: ");
        System.out.println("byte: el tipo de dato numérico más pequeño - 8 bits");
        byte variableByte = 127;
        System.out.println(variableByte);
        // quiero cambiar el valor de la variable
        // eso se llama reasignar
        variableByte = -128;
        System.out.println(variableByte);
        System.out.println("short: el siguiente en tamaño (16 bits, o 2 bytes)");
        short numeroShort = Short.MAX_VALUE;
        System.out.println(numeroShort);
        numeroShort = Short.MIN_VALUE;
        System.out.println(numeroShort);
        System.out.println("int: el que se suele utilizar (32 bits, o 4 bytes)");
        int numeroInt = Integer.MAX_VALUE;
        System.out.println(numeroInt);
        numeroInt = Integer.MIN_VALUE;
        System.out.println(numeroInt);
        System.out.println("long: el más grande (64 bits o 8 bytes)");
        System.out.println("se escribe con una L al final");
        long numeroLargo = Long.MAX_VALUE;
        System.out.println(numeroLargo);
        numeroLargo = Long.MIN_VALUE;
        System.out.println(numeroLargo);
        long numeroCualquiera = 0L;
        System.out.println("\n\nNúmeros decimales: ");
        System.out.println("float: a veces da resultados imprecisos");
        System.out.println("hay que añadir una f al final del número");
        float numeroFloat = 3.14f;
        System.out.println(numeroFloat);
        // aquí se escriben los decimales con .
        // pero cuando introducimos un número decimal por teclado hay que escribirlo con ,
        System.out.println("Introduce un número decimal: ");
        Scanner sc = new Scanner(System.in);
        // numeroFloat = sc.nextFloat();
        System.out.println(numeroFloat);
        System.out.println("double: preferible a float");
        double numeroDouble = 0.333333333333333333333333333333333333333;
        System.out.println(numeroDouble);
        System.out.println("Para limitar el número de decimales : printf");
        System.out.printf("%.2f", numeroDouble);
        System.out.printf("\nEl resultado es: %.1f", numeroDouble);
        System.out.print("\n😀\n");
        String emoji = "\uD83D\uDE0A";
        System.out.println(emoji);
        System.out.println("♥️");

        System.out.println("Variable boolean: sólo tiene dos valores (true / false)");
        boolean mayorDeEdad = true;
        boolean carnetB1 = false;

        int numero = 999999;
        long poblacion = 8_000_000_000l;
        System.out.println();




    }
}
