package exceptii;

import java.io.IOException;
import java.rmi.AccessException;
import java.util.prefs.BackingStoreException;

public class Service {

    int calcul(int x, int y) throws RuntimeException {

        if (x < 0) {
            RuntimeException exception = new RuntimeException("eraoraekljdslgdlskghdklshfgk");
            throw exception;
        }

        return x + y;
    }

    void f() throws IOException, BackingStoreException {
        int x = 3;
        if (x == 4) {
            throw new IOException("elkljle");
        }
        if (x == 6) {
            throw new BackingStoreException("elkljle");
        }
    }

    public static void main(String[] args) {
//        System.out.println(new Service().calcul(1, 2));
//        System.out.println(new Service().calcul(-1, 2));

        // important stuff
        {
            try {
                new Service().f();
                // c.close()
            } catch (Throwable e) {
                System.out.println("trimite mail");
                // c.close()
            } finally {
                // c.close()
            }

            // complex stuff
        }

    }

}
