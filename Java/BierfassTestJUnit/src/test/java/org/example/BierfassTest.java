package org.example;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BierfassTest {
    Bierfass fass;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fass = new Bierfass("helles");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void massZapfen() {
        double davor = fass.getFuellstand();
        fass.massZapfen();
        assert(fass.getFuellstand() == davor - 1);
    }

    @org.junit.jupiter.api.Test
    void fassLeermachen() {
        while(fass.getFuellstand() >= -1){
            fass.massZapfen();
        }
        assert(fass.getFuellstand() == 0);
    }

    @org.junit.jupiter.api.Test
    void getBiersorte() {
        assertEquals("helles", fass.getBiersorte());
    }
}