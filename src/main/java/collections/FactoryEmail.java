package collections;

import java.util.ArrayList;
import java.util.List;

public class FactoryEmail {

    static List<Email> createProducts() {
        List<Email> list = new ArrayList<>();

        list.add(new Email());
        list.add(new Email());

        return list;
    }

}
