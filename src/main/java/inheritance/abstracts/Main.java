package inheritance.abstracts;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//        animal.mananca();

        Dog dog = new Dog();
        dog.mananca();

        new Cat().mananca();

        Cat cat = new Cat();
        cat.mananca();
        scrie(cat);


        Hamster hx;
        hx = new Hamster();
        hx.mananca();


        scrie(hx);
        scrie(dog);
        scrie(cat);
    }

    private static void scrie(Animal x) {
        System.out.println("animal " + x);
    }
}
