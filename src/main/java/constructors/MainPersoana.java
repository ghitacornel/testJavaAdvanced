package constructors;

public class MainPersoana {
    public static void main(String[] args) {

        Persoana persoana1 = new Persoana(1,"ion");

        Persoana persoana2 = new Persoana(2,"gheorghe");

        Persoana persoana3=new Persoana();
        persoana3.setId(3);
        persoana3.setNume("vasile");

        afiseazaPersoana(persoana1);
        afiseazaPersoana(persoana2);
        afiseazaPersoana(persoana3);


    }

    private static void afiseazaPersoana(Persoana parametru) {
        System.out.println("nume=" + parametru.getNume() + " id=" + parametru.getId());
    }
}
