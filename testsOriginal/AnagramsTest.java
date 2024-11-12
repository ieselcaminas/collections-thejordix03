import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.io.*;
class AnagramsTest {

    @Test
    void test() throws IOException{
        String linea = Anagrams.anagrams(5).split(System.lineSeparator())[4919];
        // assertion
        assertEquals("7: [estaban, absenta, batanes, estaban, sentaba, tebanas, tensaba]", linea);
    }

    @Test
    void test2() throws IOException{
        String linea = Anagrams.anagrams(5).split(System.lineSeparator())[4783];
        assertEquals("13: [sector, cestro, cetros, cortes, cortes, cortes, costre, cresto, rectos, sector, tercos, torces, troces]", linea);
    }
    //20: [armenico, armonice, camerino, caminero, camioner, carmineo, cerniamo, comenari, comerian, comieran, cominear, cominera, enamoric, encimaro, encomiar, maricone, menoraci, microane, ranciemo, renacimo]

    @Test
    void test3() throws IOException{
        //101 15: [adonarse, adorasen, adornase, arandose, arenados, asenorad, endosara, enrasado, ondearas, resonada, sanadore, senadora, senorada, sonadera, sondeara]
        String linea = Anagrams.anagrams(15).split(System.lineSeparator())[101];
        assertEquals("15: [adonarse, adorasen, adornase, arandose, arenados, asenorad, endosara, enrasado, ondearas, resonada, sanadore, senadora, senorada, sonadera, sondeara]", linea);
    }
}