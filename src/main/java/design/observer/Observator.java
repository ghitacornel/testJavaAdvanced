package design.observer;

public interface Observator {

    void notificaSchimbareDeValoare(Model target, int oldValue, int newValue);

}
