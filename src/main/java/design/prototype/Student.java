package design.prototype;

public class Student {

    int cnp;
    String name;
    int age;
    boolean casatorit;
    boolean orfan;
    int sex;
    String etnie = "roman";
    boolean taxa = false;

    private Student() {
        sex = 1;
        age = 19;
        orfan = false;
        casatorit = false;
    }

    public static Student TEMPLATE = new Student();

    public Student(Student student, int cnp, String name) {
        // check for nulls
        this.cnp = cnp;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cnp=" + cnp +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", casatorit=" + casatorit +
                ", orfan=" + orfan +
                ", sex=" + sex +
                ", etnie='" + etnie + '\'' +
                ", taxa=" + taxa +
                '}';
    }
}
