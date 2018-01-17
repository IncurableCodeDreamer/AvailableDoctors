package com.example.student.kolokwiumpum;

/**
 * Created by student on 2018-01-17.
 */

public class Lekarz {
    public Lekarz(String nazwa, String specjalnosc) {
        Nazwa = nazwa;
        Specjalnosc = specjalnosc;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getSpecjalnosc() {
        return Specjalnosc;
    }

    public void setSpecjalnosc(String specjalnosc) {
        Specjalnosc = specjalnosc;
    }

    String Nazwa;
    String Specjalnosc;

}
