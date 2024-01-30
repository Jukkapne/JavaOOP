package com.javaesimerkki.javaoop;

// Abstrakti yliluokka, joka kuvaa yleistä ajoneuvoa
abstract class Ajoneuvo {
    private String nimi;

    public Ajoneuvo(String nimi) {
        this.nimi = nimi;
    }

    // Abstrakti metodi, joka on määritelty mutta ei toteutettu tässä luokassa
    public abstract void aja();

    // Konkreettinen metodi, joka on toteutettu tässä luokassa
    public void pysakoi() {
        System.out.println(this.nimi + " pysähtyy.");
    }
}