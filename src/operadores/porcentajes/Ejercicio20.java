package operadores.porcentajes;

import java.util.Scanner;

/**
 * Haz el ejercicio anterior aplicando, además, un descuento del 15% sobre el total de la compra. */
public class Ejercicio20 {
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
        double calculoDeIva = precioTotalSinIVA * (iva / 100.0);
        //System.out.print("Precio total a pagar: " + (precioTotalSinIVA + calculoDeIva));
        // aplicamos un descuento del 15% sobre el total
        // 1) calculamos el 15%
        // el precio total será
        double total = precioTotalSinIVA + calculoDeIva;
        double calculo15porc = total * (15.0 / 100.0);
        // descontamos
        double totalConDescuento = total - calculo15porc;
        System.out.println("Precio final: " + totalConDescuento + "€.");
    }
}
