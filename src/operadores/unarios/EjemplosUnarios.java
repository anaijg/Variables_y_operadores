package operadores.unarios;

public class EjemplosUnarios {
    public static void main(String[] args) {
        // se utilizan con una única variable entera
        // ++ -> le añade una unidad
        // -- -> le quita una unidad

        // Importante: se pueden utilizar delante o detrás de la variable
        // si se utilizan delante: primero incrementa o decrementa y luego hace el resto
        // Ejemplo:
        int variable = 10;
        // aplicamos preincremento
        System.out.println(++variable); // 11

        // si se utilizan detrás de la variable, primero hace lo que sea y después incrementa
        System.out.println(variable); // 11
        System.out.println(variable++); // 11
        System.out.println(variable); // 12

        // para las variables boolean tenemos el operador ! (NOT): cambia el valor de la variable a su opuesto
        // Ejemplo:
        boolean encontrado = false;
        System.out.println(encontrado);
        // imprimimos lo contrario
        System.out.println(!encontrado);

    }
}
