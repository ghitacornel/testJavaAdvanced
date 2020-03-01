package design.facade;

public class Main {

    public static void main(String[] args) {

        EvidentaAngajatilor evidentaAngajatilor = new EvidentaAngajatilor();

        HRClient hrClient = evidentaAngajatilor.getHrClient();

        hrClient.numaraAngajati();

    }
}
