package inheritance.abstracts;

public abstract class Animal {

    String nume;
    int varsta;
    int greutate;

    public Animal() {
    }

    public Animal(String nume) {
        this(nume, 1, 1);
    }

    public Animal(String nume, int varsta, int greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    abstract void mananca();

}
