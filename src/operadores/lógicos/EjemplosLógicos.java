package operadores.lógicos;

public class EjemplosLógicos {
    public static void main(String[] args) {
        // se utilizan con variables de tipo boolean
        boolean encendido =false;
        System.out.println("encendido: " + encendido);
        boolean enchufado = false;
        System.out.println("enchufado: " + enchufado);

        // con este tipo de variables, además de los operadores relacionales
        // funcionan los operadores lógicos

        // ! se traduce por NOT y lo que hace es asignar el valor contrario
        // es decir: si es true se pone a false y si es false se pone a true
        System.out.println("!encendido: " + !encendido);
        System.out.println("!enchufado: " + !enchufado);

        // && se traduce por AND y quiere decir "esto y lo otro"
        // solo devuelve true si ambos operandos son true
        // en los demás casos, son false
        // || OR, que significa "o esto, o lo otro, o ambos"
        // es false cuando ambas variables son false ("ni esto, ni lo otro")
        // en el resto de los casos es true
        System.out.println("***** operador AND y OR *********");
        encendido = true;
        enchufado = true;
        System.out.println("true && true: " + (encendido && enchufado)); // true
        System.out.println("true || true: " + (encendido || enchufado)); // true
        encendido = true;
        enchufado = false;
        System.out.println("true && false: " + (encendido && enchufado)); // false
        System.out.println("true || false: " + (encendido || enchufado)); // true
        encendido = false;
        enchufado = true;
        System.out.println("false && true: " + (encendido && enchufado)); // false
        System.out.println("false || true: " + (encendido || enchufado)); // false
        encendido = false;
        enchufado = false;
        System.out.println("false && false: " + (encendido && enchufado)); // false
        System.out.println("false || false: " + (encendido && enchufado)); // false





    }
}
