package design.singleton;

public class Main {

    public static void main(String[] args) {
//        SingletonExample.getInstance().business();
//        SingletonExample.getInstance().business();

        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.business();

    }
}
