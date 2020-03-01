package design.observer;

public class Ion implements Observator {
    @Override
    public void notificaSchimbareDeValoare(Model target, int oldValue, int newValue) {
        System.out.println("Ion a fost notificat ca pentru modelul " + target + " s-a schimbat valoarea de la " + oldValue + " la " + newValue);
    }
}
