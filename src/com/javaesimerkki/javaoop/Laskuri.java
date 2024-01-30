package com.javaesimerkki.javaoop;

// Staattinen Laskuri-luokka
class Laskuri {
    // Staattinen muuttuja, joka laskee Laskuri-olioiden määrän
    private static int laskuri = 0;

    public Laskuri() {
        // Kun luodaan uusi Laskuri-olio, kasvatetaan laskurin arvoa
        laskuri++;
        System.out.println("Laskuri-olioita luotu: " + laskuri);
    }

    // Staattinen metodi, joka palauttaa luotujen Laskuri-olioiden määrän
    public static int getLaskuri() {
        return laskuri;
    }
}