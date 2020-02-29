package design.singleton;

// final pe clasa
public class SingletonExample {

    // PAS 1 : constructor privat
    private SingletonExample() {
    }

    // PAS 2 : 1 singur object 'immutable' pentru toata aplicatia
    private static final SingletonExample instanta = new SingletonExample();

    // PAS 3 : 1 singur mod de acces al singurei instante
    public static SingletonExample getInstance() {
        return instanta;
    }

    // business
    void business() {
        System.out.println(instanta);
    }

}
