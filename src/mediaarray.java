import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mediaarray {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        double suma = 0;
        notas.add (1);
        notas.add (5);
        notas.add (8);
        notas.add(7);

        for(int i=0 ; i<notas.size() ; i++){
            suma += notas.get(i);

        }
        System.out.println (suma/ notas.size());
        //ordenar un ararylist
        Collections.sort(notas);
    }
}
