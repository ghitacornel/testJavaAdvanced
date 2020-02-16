package threads;

import java.util.Random;

public class MyRunnable implements Runnable {

    final int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        synchronized (this) {

            int sleep = new Random().nextInt(5000) + 3000;
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("do it for my runnable id = " + id + " and waited " + sleep);

        }

    }
}
