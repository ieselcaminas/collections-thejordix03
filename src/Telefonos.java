import java.util.HashMap;
import java.util.Scanner;

public class Telefonos {

    public static void buscarNumero(HashMap<String, String> numero) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de Jordi,Pepe,Rosa o Victor: ");
        String nombre = scanner.nextLine();

        if (numero.containsKey(nombre)) {
            System.out.println("El telefono de " + nombre + " es " + numero.get(nombre) + ".");
        } else {
            System.out.println("El nombre " + nombre + " no está en la lista.");
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Pepe", "6926722");
        agenda.put("Rosa", "992822");
        agenda.put("Jordi", "6272722");
        agenda.put("Victor", "782622");

        buscarNumero(agenda);
    }
}
