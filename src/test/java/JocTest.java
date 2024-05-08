import game.Joc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class JocTest {

    @org.junit.jupiter.api.Test
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

    @org.junit.jupiter.api.Test
    @CsvSource({"1,1", "2,1","3,2"})
    void primerturno() {
        char[][] taulell = {
                {'#','#','#'},
                {'#','#','#'},
                {'#','#','#'}
        };
        Joc joc = new Joc();
        Assertions.assertArrayEquals(taulell, joc.getTaulell());
    }
}