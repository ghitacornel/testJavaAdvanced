package design.singleton.enums;

public enum SingletonEnumExample {

    instanta_ROM(10),
    instanta_USA(20),
    instanta_GER(15);

    private float procentTaxa;

    SingletonEnumExample(float procentTaxa) {
        this.procentTaxa = procentTaxa;
    }

    float calculeazaImpozitSomaj(float salary) {
        return salary / procentTaxa;
    }

}
