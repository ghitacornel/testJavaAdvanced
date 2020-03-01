package design.factory;

public class Fabrica {

    String name;

    Product createMustar() {
        MustarDeTecuci product = new MustarDeTecuci();
        product.code = 1;
        product.fabrica = name;
        return product;
    }


    Product createKetchup() {
        Ketchup product = new Ketchup();
        product.code = 2;
        product.fabrica = name;
        return product;
    }

    @Override
    public String toString() {
        return "Fabrica{" +
                "name='" + name + '\'' +
                '}';
    }
}
