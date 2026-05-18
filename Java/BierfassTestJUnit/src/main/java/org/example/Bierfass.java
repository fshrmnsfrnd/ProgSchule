package org.example;

public class Bierfass {
    private double kapazitaet = 100;
    private double fuellstand = 99;
    private String biersorte = "Märzen";
    public Bierfass(String sorte) {
        biersorte = sorte;
    }

    public void massZapfen() {
        fuellstand = fuellstand - 1;
    }

    public double getFuellstand() {
        return fuellstand;
    }

    public String getBiersorte() {
        return biersorte;
    }
    public double getKapazitaet() {
        return kapazitaet;
    }
}
