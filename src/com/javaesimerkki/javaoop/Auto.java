package com.javaesimerkki.javaoop;

// Aliluokka, joka perii Ajoneuvo-luokan
class Auto extends Ajoneuvo {
    private String merkki;
    private static int autojenMaara = 0; // Staattinen muuttuja auto-olioiden määrän laskemiseksi

    public Auto(String nimi, String merkki) {
        super(nimi); // Kutsuu yliluokan konstruktoria
        this.merkki = merkki;
        autojenMaara++; // Kasvattaa auto-olioiden määrää
    }

    // Ylikirjoitetaan aja()-metodi
    @Override
    public void aja() {
        System.out.println("Tämä on " + this.merkki + "-merkkinen auto, ja se ajaa.");
    }

    // Staattinen metodi, joka palauttaa luotujen auto-olioiden määrän
    public static int getAutojenMaara() {
        return autojenMaara;
    }
}