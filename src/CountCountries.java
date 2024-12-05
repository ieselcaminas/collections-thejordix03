import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCountries {

    private static Map<String, Integer> countCountriesFromFile(String filePath) throws IOException {
        Map<String, Integer> countries = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String line;
        String[] campos;
        String pais;
        Integer cuantos;

        while ((line = reader.readLine()) != null) {
            campos = line.split(",");
            pais = campos[6];
            cuantos = countries.get(pais);
            countries.put(pais, cuantos == null ? 1 : cuantos + 1);
        }
        reader.close();
        return countries;
    }

    private static void alumnos(Map<String, Integer> countries, String country) {
        Integer count = countries.get(country);
        if (count != null) {
            System.out.println("El número de alumnos de " + country + " es: " + count);
        } else {
            System.out.println("No hay alumnos de " + country);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath =  "files/Colfuturo-Seleccionados.csv";

        Map<String, Integer> countries = countCountriesFromFile(filePath);

        System.out.print("Introduce el nombre del país para contar los alumnos: ");
        String country = scanner.nextLine();

        alumnos(countries, country);

    }
}