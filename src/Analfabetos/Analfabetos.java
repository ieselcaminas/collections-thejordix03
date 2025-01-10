package Analfabetos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analfabetos {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("files/poblacion.csv"));
        List<Pais> paises = new ArrayList<>();
        Pais pais;
        String linea;
        String[] datos;

        br.readLine();
        while ((linea = br.readLine()) != null) {
            datos = linea.split(",");
            pais = new Pais (datos[5],Integer.parseInt(datos[8]));
            paises.add(pais);

        }
        paises.stream()
                .sorted()
                .forEach(System.out::println);
    }
}