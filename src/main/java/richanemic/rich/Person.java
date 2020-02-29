package richanemic.rich;

public class Person {

    int CNP;
    String name;
    Sex sex = Sex.NA;
    int salary;
    int age;

    float calculeazaTaxe() {
        return salary / (float) age;
    }

    float calculeazaTaxeBasedOnSex() {
        return salary / (float) age + sex.ordinal();
    }

    String getNameAndCNP() {
        return name + " " + CNP;
    }

}
