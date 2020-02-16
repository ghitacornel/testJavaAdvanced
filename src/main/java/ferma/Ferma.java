package ferma;

import ferma.pasari.Pasare;

import java.util.ArrayList;
import java.util.List;

public class Ferma {

    List<Animal> animals = new ArrayList<>();

    void printAll() {
        System.out.println(animals);
    }

    void daDeMancareLaAnimale() {
        for (Animal animal : animals) {
            animal.mananca();
        }
    }

    void faPasareleleSaCante() {
        for (Animal animal : animals) {
            if (animal instanceof Pasare) {
                Pasare pasare = (Pasare) animal;
                pasare.canta();
            }
        }
    }
}
