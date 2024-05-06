package game;
import org.junit.jupiter.api.Assertions;

class JocTest {

    @org.junit.jupiter.api.Test
    void creacion () {
        String[][] taulell = {
                {"|"," ","|"," ","|"," ","|"},
                {"|"," ","|"," ","|"," ","|"},
                {"|"," ","|"," ","|"," ","|"}
        };

    }

    @org.junit.jupiter.api.Test
    void primerturno() {
        int x = 1;
        int y = 1;
        char[][] tc = new char[3][3];
        tc[x][y] = 'x';
        Joc joc = new Joc();
        Assertions.assertArrayEquals(tc, joc.getTaulell());
    }
}