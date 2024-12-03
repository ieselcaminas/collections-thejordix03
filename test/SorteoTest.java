import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SorteoTest {

    @Test
    void terminaciones() {
        Map<Integer, Integer> terminaciones = new HashMap<>();
        terminaciones.put(4, 2);
        terminaciones.put(7, 1);
        assertEquals(terminaciones, Sorteo.terminaciones(new String[]{"00004", "03847", "39804"}));

        terminaciones = new HashMap<>();
        terminaciones.put(4, 1);
        terminaciones.put(5, 2);
        terminaciones.put(8, 1);
        assertEquals(terminaciones, Sorteo.terminaciones(new String[]{"58975", "25894", "52985", "98598"}));
    }
}