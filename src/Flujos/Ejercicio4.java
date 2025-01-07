import java.util.*;
import java.util.stream.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Introduce números (introduce un número negativo para terminar):");

        // Leer la entrada del usuario
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break; // Detener si el número es negativo
            }
            numbers.add(input); // Agregar el número a la lista
        }

        // Filtrar los números entre 1 y 5 y procesarlos con streams
        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num >= 1 && num <= 5) // Filtrar números entre 1 y 5
                .collect(Collectors.toList()); // Recopilar los números como lista

        // Imprimir los números resultantes
        System.out.println("Números entre 1 y 5:");
        filteredNumbers.forEach(System.out::println);
    }
}
