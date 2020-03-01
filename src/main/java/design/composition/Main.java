package design.composition;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();

        Audio audio = new Audio();
        audio.radio = radio;

        Volan volan = new Volan();

        Masina masina = new Masina();
        masina.audio = audio;
        masina.volan = volan;
        masina.roti.add(new Roti());
        masina.roti.add(new Roti());
        masina.roti.add(new Roti());
        masina.roti.add(new Roti());

    }
}
