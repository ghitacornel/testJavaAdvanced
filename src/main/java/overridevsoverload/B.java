package overridevsoverload;

public class B extends A {

    @Override
    void f() {
        System.out.println("B");
    }

    void f(int x) {
        System.out.println("B +" + x);
    }

    void f(int x, String y) {
        System.out.println("B +" + x + y);
    }

}
