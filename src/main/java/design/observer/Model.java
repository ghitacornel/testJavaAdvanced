package design.observer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Model {

    final private List<WeakReference<Observator>> observators = new ArrayList<>();

    private int value;

    private int valueSpecial;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        for (WeakReference<Observator> observator : observators) {
            Observator o = observator.get();
            if (o != null) {
                o.notificaSchimbareDeValoare(this, this.value, value);
            }
        }
        this.value = value;
    }

    public void registerNewObserver(Observator observator) {
        observators.add(new WeakReference<>(observator));
    }

    @Override
    public String toString() {
        return "Model{" +
                "value=" + value +
                '}';
    }
}
