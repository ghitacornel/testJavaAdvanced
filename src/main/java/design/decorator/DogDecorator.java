package design.decorator;

public class DogDecorator extends Dog {

    final private Dog dog;

    public DogDecorator(Dog dog) {
        this.dog = dog;
    }


    @Override
    void bark() {
        dog.bark();
        System.out.println("musca");
    }
}
