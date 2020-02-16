package ferma;

import ferma.mamifere.Porc;
import ferma.pasari.Gaina;
import ferma.paza.Caine;
import ferma.paza.Pisica;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Ferma ferma = new Ferma();

        {// creaza & adauga animale

            Pisica pisica = new Pisica();
            ferma.animals.add(pisica);

            Caine caine = new Caine();
            ferma.animals.add(caine);

            Gaina gaina = new Gaina();
            ferma.animals.add(gaina);

            Porc porc = new Porc();
            ferma.animals.add(porc);

        }

        ferma.printAll();
        ferma.daDeMancareLaAnimale();
        ferma.faPasareleleSaCante();

        Set<Integer> integers=new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        System.out.println(integers);

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"asf");
        map.put(2,"asf");
        map.put(1,"xxx");
        System.out.println(map.entrySet());

        Collections.sort(new ArrayList<Integer>(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
