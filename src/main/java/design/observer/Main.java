package design.observer;

public class Main {

    public static void main(String[] args) {

        Gheorghe gheorghe = new Gheorghe();
        Ion ion = new Ion();

        Model model = new Model();
        model.setValue(1);
        System.out.println(model);

        model.registerNewObserver(gheorghe);
        model.registerNewObserver(ion);

        model.setValue(2);

        faCeva(model);

    }

    private static void faCeva(Model model) {
        model.setValue(3);
    }
}
