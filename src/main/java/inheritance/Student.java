package inheritance;

public class Student extends Person {

    int year;

    {
        System.out.println("initial all");
    }

    public Student() {
        this("kjhdkgh",11);
        System.out.println(1);
    }

    public Student(String name) {
        super("ion",3);
        this.year = 3;
        this.age = 11;
        this.name = name;
        System.out.println(2);
    }

    public Student(String name, int x) {
        this.year = 30;
        this.age = x;
        this.name = name;
        System.out.println(3);
    }

    @Override
    void f() {
        System.out.println("kjdshkghdgk");
        super.f();
    }

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("ghe");

        Student student3 = new Student("gheor", 111);

        System.out.println("aaa");
    }
}
