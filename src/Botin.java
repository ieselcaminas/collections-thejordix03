import java.util.*;

public class Botin {

    public static Map<Integer, List<Integer>> repartir(int participantes, String[] billetes) {
        Map<Integer, List<Integer>> reparto = new HashMap<>();

        for (int i = 0; i < billetes.length; i++) {

            String billete = billetes[i];
            int letocaA = i % participantes;

            int billeteInt = Integer.parseInt(billete);

            if (!reparto.containsKey(letocaA)) {
                reparto.put(letocaA, new ArrayList<>());
            }
            reparto.get(letocaA).add(billeteInt);
        }
        return reparto;
    }
    public static void main(String[] args) {
        int participantes = 3;

        String[] billetes = {"50", "20", "100", "200", "500", "10", "50"};

        Map<Integer, List<Integer>> resultado = repartir(participantes, billetes);

        System.out.println(resultado);
    }
}