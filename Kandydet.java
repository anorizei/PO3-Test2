package com.company;

public class Kandydet implements Cloneable, Comparable<Kandydet>{

    private String nazwa;
    private int wiek;
    private wykształcony wykształcony;
    private int latadoswiadczenia;

    public Kandydet(String nazwa, int wiek, com.company.wykształcony wykształcony, int latadoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wykształcony = wykształcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public com.company.wykształcony getWykształcony() {
        return wykształcony;
    }

    public int getLatadoswiadczenia() {
        return latadoswiadczenia;
    }

    @Override
    public String toString(){
        return "Nazwa " + nazwa +" Wiek " + wiek +" Wyksztalcony "
                + wykształcony + " Lat doswiadczenia "+ latadoswiadczenia;
    }

    @Override
    public int compareTo(Kandydet o) {
        return 0;
    }
}