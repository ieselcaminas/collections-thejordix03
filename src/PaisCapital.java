import java.util.HashMap;
import java.util.Scanner;

public class PaisCapital {

    public static void buscarCapital(HashMap<String, String> paisCapital) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de un país europeo: ");
        String pais = scanner.nextLine();

        if (paisCapital.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + paisCapital.get(pais) + ".");
        } else {
            System.out.println("El país " + pais + " no está en la lista.");
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> paisCapital = new HashMap<>();
        paisCapital.put("España", "Madrid");
        paisCapital.put("Francia", "París");
        paisCapital.put("Italia", "Roma");
        paisCapital.put("Alemania", "Berlín");
        paisCapital.put("Portugal", "Lisboa");
        paisCapital.put("Grecia", "Atenas");

        buscarCapital(paisCapital);
    }
}
