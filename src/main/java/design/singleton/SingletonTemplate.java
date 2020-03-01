package design.singleton;

// final pe clasa
public class SingletonTemplate {

    // PAS 1 : constructor privat
    private SingletonTemplate() {
    }

    // PAS 2 : 1 singur object 'immutable' pentru toata aplicatia
    private static final SingletonTemplate instanta = new SingletonTemplate();

    // PAS 3 : 1 singur mod de acces al singurei instante
    public static SingletonTemplate getInstance() {
        return instanta;
    }

    // business
    void business() {
        System.out.println(instanta);
    }

}
