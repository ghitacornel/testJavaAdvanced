package design.decorator;

public class MainDog {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();

        System.out.println("========");

        DogSuper dogSuper = new DogSuper();
        dogSuper.bark();

        System.out.println("========");
        Dog dogDecorator1 = new DogDecorator(dog);
        dogDecorator1.bark();
        Dog dogDecorator2 = new DogDecorator(dogSuper);
        dogDecorator2.bark();


    }
}
