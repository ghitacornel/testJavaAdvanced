package keyword.vararg;

public class Main {

    public static void main(String[] args) {

        System.out.println(calculeazaImpozitPeVenituri(2, 234, 2132, 211, 24, 214));

        int a = 3;
        int b = 4;
        System.out.println(calculeazaImpozitPeVenituri(a, b));

        int c = 5;
        System.out.println(calculeazaImpozitPeVenituri(a, b, c));

        System.out.println(calculeazaImpozitPeVenituri(2));

    }

    private static int calculeazaImpozitPeVenituri(int venitObligatoriu, int... alteVenituri) {
        int total = venitObligatoriu;
        for (int altVenit : alteVenituri) {
            total += altVenit;
        }
        return total;
    }

    void f(String x, int y, float... z) {
        z[0] = 3;
    }
}
