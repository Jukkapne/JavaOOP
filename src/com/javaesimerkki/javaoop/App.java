package com.javaesimerkki.javaoop;

public class App {
    public static void main(String[] args) {
        // Luodaan Auto-olioita ja tulostetaan niiden määrä
        Auto auto1 = new Auto("Henkilöauto", "Toyota");
        Auto auto2 = new Auto("Henkilöauto", "Ford");
        System.out.println("Yhteensä Auto-olioita: " + Auto.getAutojenMaara());

        // Luodaan Ajoneuvo-olio ja demonstroidaan perintää
        auto1.aja();    // Kutsuu Auto-luokan ylikirjoitettua aja()-metodia
        auto1.pysakoi(); // Kutsuu Ajoneuvo-luokan pysakoi()-metodia
        auto2.aja();    // Kutsuu Auto-luokan ylikirjoitettua aja()-metodia
        auto2.pysakoi(); // Kutsuu Ajoneuvo-luokan pysakoi()-metodia
    }
}