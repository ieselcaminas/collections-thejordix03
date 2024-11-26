import java.util.ArrayList;
import java.util.Scanner;

public class Altura {

    public static int numeroAlumnos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de alumnos: ");
        return scanner.nextInt();
    }

    public static void leerAlturas(ArrayList<Double> alturas, int numeroAlumnos) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.print("Introduce la altura del alumno " + (i + 1) + " (en cm o metros) : ");
            double altura = scanner.nextDouble();
            alturas.add(altura);
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0.0;
        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);
        }
        return suma / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {
                contador++;
            }
        }return contador;

    }

    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        System.out.println("\nAlturas de los alumnos:");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i));
        }

        System.out.println("Altura media: " + media);
        System.out.println("Número de alumnos con altura superior a la media: " + calcularAlumnosAlturaSuperior(alturas, media));
        System.out.println("Número de alumnos con altura inferior a la media: " +  calcularAlumnosAlturaInferior(alturas, media));
    }
    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<>();

        int numeroAlumnos = numeroAlumnos();
        leerAlturas(alturas, numeroAlumnos);

        double media = calcularMedia(alturas);
        mostrarResultados(alturas, media);
    }
}
