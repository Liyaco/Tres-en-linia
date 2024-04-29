package test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class JocTest {

    @org.junit.jupiter.api.Test
    void creaciondejuego() {
    }

    @org.junit.jupiter.api.Test
    void primerturno() {
        Joc joc = new Joc();
        short tornx = 0;
        Assertions.assertEquals(tornx, joc.getTorn);
    }

}