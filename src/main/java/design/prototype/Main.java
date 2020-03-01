package design.prototype;

public class Main {
    public static void main(String[] args) {

        Student model1 = new Student(Student.TEMPLATE, 1, "ion");

        Student model2 = new Student(Student.TEMPLATE, 2, "gheorghe");
        model2.taxa = true;

        System.out.println(model1);
        System.out.println(model2);

    }
}
