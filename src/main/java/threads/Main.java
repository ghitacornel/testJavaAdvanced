package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThread(i);
            thread.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }

        System.out.println("stop");
    }
}
