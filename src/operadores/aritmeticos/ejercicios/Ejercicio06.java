package operadores.aritmeticos.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempoEnSegundos = sc.nextInt();

        // primero extraemos las horas
        // en una hora hay 3600 segundos
        int horas = tiempoEnSegundos / 3600;
        // el resto son los segundos que me quedan tras haber quitado las horas al tiempo inicial
        int segundos = tiempoEnSegundos % 3600;

        // lo siguiente es quitar a esos segundos los minutos que contienen
        int minutos = segundos / 60;
        // el resto son los segundos que sobran tras haber extraído las horas y los minutos
        segundos = segundos % 60;
        System.out.println("En " + tiempoEnSegundos + " hay " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}
