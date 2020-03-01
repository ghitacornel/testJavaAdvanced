package design.decorator;

public class DogSuper extends Dog {
    @Override
    void bark() {
        super.bark();
        System.out.println("da din coada");
    }
}
