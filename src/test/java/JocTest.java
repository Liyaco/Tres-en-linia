import org.junit.jupiter.api.Assertions;
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
}