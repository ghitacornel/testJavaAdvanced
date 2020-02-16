package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Clasa {

    final List<Elev> elevi = new LinkedList<>();

    public static void main(String[] args) {
        Clasa clasa = new Clasa();

        Elev e1 = new Elev();
        clasa.elevi.add(e1);

        Elev e2 = new Elev();
        clasa.elevi.add(e2);

        clasa.elevi.add(new Elev());

        System.out.println(clasa.elevi);

        clasa.elevi.remove(e1);

        System.out.println(clasa.elevi);

        Clasa x = new Clasa();


    }

}
