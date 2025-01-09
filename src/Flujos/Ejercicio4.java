package Flujos;

import java.util.*;
import java.util.stream.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Lista de números predefinida
        List<Integer> numbers = Arrays.asList(2, 4, 6, 1, 3, 7, 5, -1);

        // Filtrar los números entre 1 y 5 y procesarlos con streams
        List<Integer> numerosfiltrados = numbers.stream()
                .filter(num -> num >= 1 && num <= 5) // Filtrar números entre 1 y 5
                .collect(Collectors.toList()); // Recopilar los números como lista

        // Imprimir los números resultantes
        System.out.println("Números entre 1 y 5");
        for (Integer numero : numerosfiltrados) {
            System.out.println(numero);
        }
    }
}