package test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class JocTest {

    @org.junit.jupiter.api.Test
    void creacion () {
    }

    @org.junit.jupiter.api.Test
    void primerturno() {
        char[][] tc = new char[3][3];
        tc[1][1] = 'x';
        Joc joc = new Joc();
        Assertions.assertEquals(tc, joc.gettaulell);
    }
}