package keyword.statics;

import keyword.access.Person;

public class MainStatic {

    static int x = 3;

    static int f(int y) {
        return y * y;
    }

    private static class Dummy {
    }

    public static void main(String[] args) {

        System.out.println(MainStatic.x);
        System.out.println(MainStatic.f(4));

        MainStatic object = new MainStatic();
        System.out.println(object.x);
        System.out.println(object.f(4));

    }
}
