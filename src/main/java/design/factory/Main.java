package design.factory;

public class Main {

    public static void main(String[] args) {

        Fabrica fabrica1 = new Fabrica();
        fabrica1.name = "fabrica 1";

        Fabrica fabrica2 = new Fabrica();
        fabrica2.name = "fabrica 2";

        Product product1 = fabrica1.createMustar();
        Product product2 = fabrica1.createKetchup();
        Product product3 = fabrica2.createKetchup();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(fabrica1);
        System.out.println(fabrica2);

    }
}
