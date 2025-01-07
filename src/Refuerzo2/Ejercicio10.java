package Refuerzo2;

public class Ejercicio10 {

    public static int litros(int compartimentos, int maxLitros, int diferencia) {
        int totalLitros = 0; // Almacena la cantidad total de litros necesarios
        int capacidadActual = maxLitros; // Capacidad del compartimento más grande

        for (int i = 0; i < compartimentos; i++) {
            totalLitros += capacidadActual; // Suma la capacidad del compartimento actual
            capacidadActual -= diferencia; // Reduce la capacidad para el siguiente compartimento

            // Asegúrate de que la capacidad no sea negativa
            if (capacidadActual < 0) {
                capacidadActual = 0;
            }
        }

        return totalLitros;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println(litros(5, 300, 10)); // Salida esperada: 1400
        System.out.println(litros(4, 400, 20)); // Salida esperada: 1480
        System.out.println(litros(3, 500, 30)); // Salida esperada: 1410
    }
}
