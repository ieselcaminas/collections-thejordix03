package Comparable.Tutankamon;

import java.util.*;

class Objeto implements Comparable<Objeto> {
    String nombre;
    int valor;
    int peso;

    public Objeto(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    @Override
    public int compareTo(Objeto otro) {
        if (this.valor != otro.valor) {
            return Integer.compare(otro.valor, this.valor);
        }
        if (this.peso != otro.peso) {
            return Integer.compare(this.peso, otro.peso);
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        String input = "5\n" +
                       "flecha 5 1\n" +
                       "sandalias 10 2\n" +
                       "sarcofago 500 1000\n" +
                       "mascara 1000 10\n" +
                       "arco 10000 2\n" +
                       "0";

        Scanner scanner = new Scanner(input);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            List<Objeto> objetos = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nombre = scanner.next();
                int valor = scanner.nextInt();
                int peso = scanner.nextInt();
                objetos.add(new Objeto(nombre, valor, peso));
            }

            // Ordenar objetos según las reglas
            Collections.sort(objetos);

            for (int i = 0; i < objetos.size(); i++) {
                System.out.print(objetos.get(i).nombre);
                if (i < objetos.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}