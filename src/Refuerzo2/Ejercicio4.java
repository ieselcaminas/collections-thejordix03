package Refuerzo2;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static List<Integer> moda(int[] numeros) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            mapa.put(numero, mapa.getOrDefault(numero, 0) + 1);
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            int frecuencia = entry.getValue();
            if (frecuencia > max) {
                max = frecuencia;
            }
        }
        List<Integer> modas = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() == max) {
                modas.add(entry.getKey());
            }
        }
        return modas;
    }

    public static void main(String[] args) {
        List<Integer> resultado = moda(new int[]{3, 4, 5, 6, 3, 4, 3, 4});
        System.out.println(resultado);
    }
}