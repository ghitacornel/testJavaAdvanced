package collections;

import java.util.ArrayList;
import java.util.List;

public class FactorySMS {

    static List<SMS> createProducts() {
        List<SMS> list = new ArrayList<>();

        list.add(new SMS());
        list.add(new SMS());

        return list;
    }

}
