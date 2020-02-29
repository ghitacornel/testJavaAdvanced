package richanemic.rich;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.CNP = 1;
        person.salary = 10;
        person.age = 20;
        person.sex = Sex.M;
        person.name = "ion";

        System.out.println(person.calculeazaTaxe());
        System.out.println(person.getNameAndCNP());
    }
}
