import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class JocTest {

    @Test
    void creacion () {
        Joc joc = new Joc();
        joc.novaPartida();
        char[][] taulell = {
                {'#','#','#'},
                {'#','#','#'},
                {'#','#','#'}
        };
        Assertions.assertArrayEquals(taulell, joc.getTaulell());
    }

    @Test
    void nocreacion() {
        Joc joc = new Joc();
        joc.novaPartida();
        char[][] taulell = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };
        Assertions.assertNotEquals(taulell, joc.getTaulell());
    }

    @ParameterizedTest
    @CsvSource(
            {"0,0",
            "0,1",
            "0,2",
            "1,0",
            "1,1",
            "1,2",
            "2,0",
            "2,1",
            "2,2"}
    )
    void jugada (short x , short y) {
        Joc joc = new Joc();
        joc.novaPartida();
        Assertions.assertTrue(joc.jugar(x,y));
    }
}