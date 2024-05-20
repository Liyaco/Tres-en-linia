//import com.sun.source.tree.AssertTree;
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

    boolean jugadaGuanyadora() {
        boolean guanyador;
        char anterior;
        char actual;

        guanyador = false;

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 3; i++) {
                anterior = this.taulell[i - 1][j];
                actual = this.taulell[i][j];
                if (actual == '#' || anterior == '#') {
                    break;
                }
                else if (anterior == actual) {
                    guanyador = true;
                }
                else {
                    break;
                }
            }
        }

        if (!guanyador) {

            for (int j = 1; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    anterior = this.taulell[i][j - 1];
                    actual = this.taulell[i][j];
                    if (actual == '#' || anterior == '#') {
                        break;
                    }
                    else if (anterior == actual) {
                        guanyador = true;
                    }
                    else {
                        break;
                    }
                }
            }

            if (!guanyador) {

                for (int j = 2; j > 0; j--) {
                    for (int i = 2; i > 0; i--) {
                        anterior = this.taulell[i - 1][j - 1];
                        actual = this.taulell[i][j];
                        if (actual == '#' || anterior == '#') {
                            break;
                        }
                        else if (anterior == actual) {
                            guanyador = true;
                        }
                        else {
                            break;
                        }
                    }
                }

                if (!guanyador) {

                    for (int j = 1; j < 3; j++) {
                        for (int i = 2; i > 0; i--) {
                            anterior = this.taulell[i][j - 1];
                            actual = this.taulell[i - 1][j];
                            if (actual == '#' || anterior == '#') {
                                break;
                            }
                            else if (anterior == actual) {
                                guanyador = true;
                            }
                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return guanyador;
    }
}