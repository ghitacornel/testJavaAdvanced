package design.factory;

public class Ketchup implements Product {

    int code;
    String fabrica;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return "ketchup";
    }

    @Override
    public String getNameFabrica() {
        return fabrica;
    }
}
