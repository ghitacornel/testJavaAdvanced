package collections;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<NotificareGenerica> products = FactoryProduct.createProducts();

        System.out.println(products);

    }
}
