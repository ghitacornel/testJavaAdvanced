package interfaces;

public interface I2 {


//    void f();

     default void g() {
        System.out.println(getY());
    }

    int getY();

}
