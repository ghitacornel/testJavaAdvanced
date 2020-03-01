package design.builder;

import lombok.Builder;
import lombok.NonNull;
import richanemic.anemic.model.Sex;

@Builder
public class Person {

    private int CNP;

    @NonNull
    final private String name;

    private Sex sex = Sex.NA;
    private int salary;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "CNP=" + CNP +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
