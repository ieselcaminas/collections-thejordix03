import java.io.*;
import java.util.*;

public class Anagrams {

    private static String alfabetizar(String s) {
        char[] alfabetica = s.toCharArray();
        Arrays.sort(alfabetica);
        return new String(alfabetica);
    }
    private static List<String> leerpalabras(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-file.text"));
        List<String> words = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            words.add(line.trim().toLowerCase());
        }
        reader.close();
        return words;
    }
    private static Map<String, ArrayList<String>> agrupar(List<String> palabras) {
        Map<String, ArrayList<String>> grupos = new HashMap<>();

        for (int i = 0; i < palabras.size(); i++) {
            String palabra = palabras.get(i);
            String key = alfabetizar(palabra);
            if (!grupos.containsKey(key)) {
                grupos.put(key, new ArrayList<>());
            }
            grupos.get(key).add(palabra);
        }
        return grupos;
    }
    public static String anagrams(int minGroupSize) throws IOException {
        String filePath = "files/spanish-file.text";
        List<String> words = leerpalabras(filePath);

        Map<String, ArrayList<String>> grupos = agrupar(words);

        StringBuilder result = new StringBuilder();
        int index = 0;
        for (Map.Entry<String, ArrayList<String>> entry : grupos.entrySet()) {
            ArrayList<String> anagrams = entry.getValue();

            if (anagrams.size() >= minGroupSize) {
                result.append(index).append(": ").append(anagrams).append(System.lineSeparator());
                index++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) throws IOException {
        String result = anagrams(6);
        System.out.println(result);
    }
}