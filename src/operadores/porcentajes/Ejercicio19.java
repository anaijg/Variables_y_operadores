package operadores.porcentajes;

import java.util.Scanner;

/**
 * Realiza un programa que pida el precio de venta de un producto, la cantidad de productos comprados y el porcentaje de IVA aplicado. El programa mostrará el importe total a abonar.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio de venta: ");
        double precioVenta = scanner.nextDouble();
        System.out.print("Cantidad de productos: ");
        int numeroDeProductos = scanner.nextInt();
        System.out.print("%IVA a aplicar: ");
        double iva = scanner.nextDouble();
        // calculamos
        // lo podemos hacer calculando el total y aplicando el iva
        // o calculando y sumando el iva al producto y multiplicar por el nº de productos
        double precioTotalSinIVA = precioVenta * numeroDeProductos;
        double calculoDeIva = precioTotalSinIVA * (iva / 100);
        System.out.print("Precio total a pagar: " + (precioTotalSinIVA + calculoDeIva));
    }
}
