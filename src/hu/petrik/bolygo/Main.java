package hu.petrik.bolygo;

import hu.petrik.bolygo.bolygoprojekt.Bolygo;

public class Main {
    public static void main(String[] args) {
        for (Bolygo b: Bolygo.values()) {
            System.out.println(b + " " + b.getTomeg() + " " + b.getSugar());

        }

    }
}
