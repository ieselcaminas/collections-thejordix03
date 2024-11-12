import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PortalesTest {

    @Test
    void repartir() {
        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2, 4));
        assertEquals("2 4", Portales.repartir(0, portales).trim());
        portales = new ArrayList<>((Arrays.asList(2, 5, 1)));
        assertEquals("2 1 5", Portales.repartir(3, portales).trim());
        portales = new ArrayList<>((Arrays.asList(2, 4, 7)));
        assertEquals("4 2 7", Portales.repartir(3, portales).trim());

    }
}