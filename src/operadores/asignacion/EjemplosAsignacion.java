package operadores.asignacion;

public class EjemplosAsignacion {
    public static void main(String[] args) {
        // Operador de asignación suma +=
        int x = 10;
        System.out.println(x);

        x = x + 2; // 10 + 2 ; guarda ahora 12
        System.out.println(x);

        // esto también se puede poner así:
        x += 5; // es lo mismo que x = x + 5, o sea 17
        System.out.println(x);

        // tenemos para la resta:
        x -= 4; // x = x -4
        System.out.println(x);

        // para la multiplicación
        x *= 2; // x = x * 2
        System.out.println(x);

        // para la división
        x /= 3; // x = x / 3
        System.out.println(x);


    }
}
