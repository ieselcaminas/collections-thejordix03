import java.util.*;

class Niño {
    int comportamiento;
    int peso;

    public Niño(int comportamiento, int peso) {
        this.comportamiento = comportamiento;
        this.peso = peso;
    }

    public static int comparar(Niño thisNiño, Niño otherNiño) {
        if (thisNiño.comportamiento != otherNiño.comportamiento) {
            return Integer.compare(otherNiño.comportamiento, thisNiño.comportamiento);
        }
        return Integer.compare(thisNiño.peso, otherNiño.peso);
    }
}

public class Niños {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primer caso de prueba
        int n = 3;
        int[][] datos1 = {
                {80, 2},
                {100, 12},
                {100, 1}
        };

        List<Niño> niños1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int comportamiento = datos1[i][0];
            int peso = datos1[i][1];
            niños1.add(new Niño(comportamiento, peso));
        }

        niños1.sort((thisNiño, otherNiño) -> Niño.comparar(thisNiño, otherNiño));

        for (Niño niño : niños1) {
            System.out.println(niño.comportamiento + " " + niño.peso);
        }
        System.out.println();

        // Segundo caso de prueba
        n = 2;
        int[][] datos2 = {
                {1, 1},
                {1, 1}
        };

        List<Niño> niños2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int comportamiento = datos2[i][0];
            int peso = datos2[i][1];
            niños2.add(new Niño(comportamiento, peso));
        }
        niños2.sort((thisNiño, otherNiño) -> Niño.comparar(thisNiño, otherNiño));

        for (Niño niño : niños2) {
            System.out.println(niño.comportamiento + " " + niño.peso);
        }
        System.out.println();

    }
}