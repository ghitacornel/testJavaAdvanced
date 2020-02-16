package overridevsoverload;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        a.f();

        B b = new B();
        b.f();

        b.f(3);
        b.f(3, "aa");

    }
}
