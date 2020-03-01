package design.factory;

public class MustarDeTecuci implements Product {

    int code;
    String fabrica;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return "mustar";
    }

    @Override
    public String getNameFabrica() {
        return fabrica;
    }
}
