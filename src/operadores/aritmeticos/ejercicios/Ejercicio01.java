package operadores.aritmeticos.ejercicios;

/*
    A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        // creo una variable para cada operación
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int modulo = num1 % num2;
        // muestro el valor de las variables
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Producto = " + producto);
        System.out.println("Cociente = " + cociente);
        System.out.println("Módulo = " + modulo);
    }
}
