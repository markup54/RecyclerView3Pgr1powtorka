package com.example.recyclerview3pgr1powtorka;

public class Obrazki {
    private int idObrazka;
    private String opisObrazka;

    public Obrazki(int idObrazka, String opisObrazka) {
        this.idObrazka = idObrazka;
        this.opisObrazka = opisObrazka;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getOpisObrazka() {
        return opisObrazka;
    }
}
