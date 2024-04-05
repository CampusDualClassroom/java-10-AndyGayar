package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int blueCount = 0;
        do {
            String ballColor = getBall();
            System.out.println("La bola es de color: " + ballColor);
            if (ballColor.equals("azul")) {
                blueCount++;
            }
        } while (blueCount < 2);
    }

    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula).
    // Dicho color se escogerá de manera aleatoria.
    public static String getBall() {
        int randomNumber = randomWithRange(1, 3); // Genera un número aleatorio entre 1 y 3
        switch (randomNumber) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                return ""; // En caso de que el número no sea 1, 2 o 3, devuelve una cadena vacía
        }
    }

    // Método auxiliar para generar un número aleatorio dentro de un rango
    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1); // Se suma 1 al máximo para incluirlo en el rango
    }
}
