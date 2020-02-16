package inheritance;

public class Person {

    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        if (name == null) throw new RuntimeException("loooo");
    }

    void f() {
        System.out.println("parinte");
    }

}
