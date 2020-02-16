package collections;

import java.util.ArrayList;
import java.util.List;

public class FactoryProduct {

    static List<NotificareGenerica> createProducts() {
        List<NotificareGenerica> list = new ArrayList<>();

        list.add(new Notificare());
        list.add(new Notificare());
        list.add(new Notificare());

        list.addAll(FactorySMS.createProducts());
        list.addAll(FactoryEmail.createProducts());

        return list;
    }

}
