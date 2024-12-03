import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelefonosII {

    public static void buscarNumero(HashMap<String, ArrayList<String>> agenda) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del contacto(Jordi o Pepe): ");
        String nombre = scanner.nextLine();

        if (agenda.containsKey(nombre)) {
            System.out.println("Teléfonos de " + nombre + ": " + agenda.get(nombre));
        } else {
            System.out.println("El nombre " + nombre + " no está en la lista.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("667761");
        telefonos.add("+0034 44001");
        agenda.put("Pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("987654");
        agenda.put("Jordi", telefonos);


        buscarNumero(agenda);
    }
}
