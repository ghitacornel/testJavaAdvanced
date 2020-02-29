package design.singleton.enums;

public class Main {

    public static void main(String[] args) {

        System.out.println(SingletonEnumExample.instanta_ROM.calculeazaImpozitSomaj(100));
        System.out.println(SingletonEnumExample.instanta_USA.calculeazaImpozitSomaj(100));
        System.out.println(SingletonEnumExample.instanta_GER.calculeazaImpozitSomaj(100));

    }
}
