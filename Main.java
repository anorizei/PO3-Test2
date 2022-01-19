package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Kandydet kandydet1 = new Kandydet("Jan",23,wykształcony.LICENCJAT,10);
        Kandydet kandydet2 = new Kandydet("Maciej",23,wykształcony.MISTRZOWIE,10);
        Kandydet kandydet3 = new Kandydet("Piotr",20,wykształcony.LICENCJAT,10);
        Kandydet kandydet4 = new Kandydet("Artur",25,wykształcony.LICENCJAT,10);
        Kandydet kandydet5 = new Kandydet("Karol",24,wykształcony.LICENCJAT,1);
        Kandydet kandydet6 = new Kandydet("Adam",24,wykształcony.LICENCJAT,8);
        ArrayList<Kandydet> grupa = new ArrayList<Kandydet>();
        grupa.add(kandydet1);
        grupa.add(kandydet2);
        grupa.add(kandydet3);
        grupa.add(kandydet4);
        grupa.add(kandydet5);
        grupa.add(kandydet6);

        grupa.forEach(kandydet -> System.out.println(kandydet.toString()));
        System.out.println(qualified(kandydet1));
        System.out.println(qualified(kandydet5));

    }
    public static boolean qualified(Kandydet k){
        Rekrutacja.setDoswiadczenieEquals2();
        if(k.getLatadoswiadczenia()>=Rekrutacja.doswiadczenie){
            return true;
        }
        return false;
    }
}