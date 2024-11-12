import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BotinTest {

    @Test
    void repartir() {
        Map<Integer, String> reparto = new HashMap<>();
        reparto.put(0, "10 50 500");
        reparto.put(1, "20 200");

        assertEquals(reparto, Botin.repartir(2, new int[]{10, 20, 50, 200, 500}));
    }

    @Test
    void repartirDos() {
        Map<Integer, String> reparto = new HashMap<>();
        reparto.put(0, "50 200 50");
        reparto.put(1, "20 500");
        reparto.put(2, "100 10");

        assertEquals(reparto, Botin.repartir(3, new int[]{50, 20, 100, 200, 500, 10, 50}));
    }
}