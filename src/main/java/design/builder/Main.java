package design.builder;

public class Main {
    public static void main(String[] args) {

        Person person1 = Person.builder().name("ion").build();
        Person person2 = Person.builder().name("gheorghe").CNP(1).build();

        Person person3 = Person.builder().name(null).CNP(1).build();

        System.out.println(person1);
        System.out.println(person2);

        DataModel dataModel = DataModel.builder().age(1).age(2).occupation("aaa").clearOccupations().build();
        System.out.println(dataModel);
    }
}
