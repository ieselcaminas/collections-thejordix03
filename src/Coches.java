import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String marca;

        System.out.println("Introduce marcas de coches (deja la línea en blanco para terminar):");

        do {
            marca = scanner.nextLine();
            if (!marca.isEmpty()) {
                marcas.add(marca);
            }

        } while (!marca.isEmpty());

        Collections.sort(marcas);

        System.out.println("\nMarcas de coches ordenadas:");
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }

    }
}
