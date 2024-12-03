import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frecuencia {
    public static HashMap<String, Integer> calcularFrecuenciaPalabras(ArrayList<String> palabras) {
        HashMap<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        return frecuencia;
    }
    public static void mostrarFrecuencia(HashMap<String, Integer> frecuencia) {
        System.out.println("Frecuencia de palabras:");
        for (String palabra : frecuencia.keySet()) {
            System.out.println(palabra + " - " + frecuencia.get(palabra));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Introduce palabras separadas por espacios (presiona Enter en blanco para finalizar):");

        while (true) {
            String linea = scanner.nextLine();
            if (linea.isEmpty()) {
                break;
            }
            String[] palabrasLinea = linea.split("\\s+");
            for (String palabra : palabrasLinea) {
                if (!palabra.isEmpty()) {
                    palabras.add(palabra);
                }
            }
        }
        HashMap<String, Integer> frecuencia = calcularFrecuenciaPalabras(palabras);

        mostrarFrecuencia(frecuencia);
    }
}
