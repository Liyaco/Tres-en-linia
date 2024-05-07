package game;
import org.junit.jupiter.api.Assertions;

class JocTest {

    @org.junit.jupiter.api.Test
    void creacion () {
        Joc joc = new Joc();
        char[][] taulell = {
                {'#','#','#'},
                {'#','#','#'},
                {'#','#','#'}
        };
        Assertions.assertEquals(taulell, joc.getTaulell());

    }

    @org.junit.jupiter.api.Test
    void primerturno() {
        char[][] taulell = {
                {'#','O','#'},
                {'#','#','#'},
                {'#','#','#'}
        };
        Joc joc = new Joc();
        Assertions.assertArrayEquals(taulell, joc.getTaulell());
    }
}