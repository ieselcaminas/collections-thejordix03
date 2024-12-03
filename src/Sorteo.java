import java.util.ArrayList;
import java.util.HashMap;

public class Sorteo {

    public static HashMap<Integer, Integer> terminaciones(ArrayList<String> boletos) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();

        for (String boleto : boletos) {
            int terminacion = Character.getNumericValue(boleto.charAt(boleto.length() - 1));
            frecuencia.put(terminacion, frecuencia.getOrDefault(terminacion, 0) + 1);
        }
        return frecuencia;
    }

    public static void mostrarFrecuencia(HashMap<Integer, Integer> frecuencia) {
        System.out.println("Frecuencia de las terminaciones:");
        for (int terminacion : frecuencia.keySet()) {
            System.out.println("Terminación " + terminacion + ": " + frecuencia.get(terminacion) + " veces");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("00004");
        boletos.add("03847");
        boletos.add("39804");
        boletos.add("58975");
        boletos.add("25894");
        boletos.add("52985");
        boletos.add("98598");

        HashMap<Integer, Integer> frecuencia = terminaciones(boletos);

        mostrarFrecuencia(frecuencia);
    }
}
