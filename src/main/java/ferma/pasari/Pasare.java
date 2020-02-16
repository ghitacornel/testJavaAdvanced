package ferma.pasari;

import ferma.Animal;

public abstract class Pasare extends Animal {

    public void canta() {
        System.out.println(this + " canta");
    }
}
