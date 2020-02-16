package threads;

import java.util.Random;

public class MyThread extends Thread {

    final int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        int sleep = new Random().nextInt(5000) + 3000;
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("do it for my thread id = " + id + " and waited " + sleep);

    }
}
