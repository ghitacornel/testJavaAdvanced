package enums;

import java.util.Arrays;

public enum WeekDays {

    LUNI(111),
    MARTI(100),
    MIERCURI(100),
    JOI(100),
    VINERI(100),
    SAMBATA(150),
    DUMINICA(150);

    private int procent;

    WeekDays(int procent) {
        this.procent = procent;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(WeekDays.values()));

        System.out.println(WeekDays.JOI);
        System.out.println(WeekDays.JOI.name());
        System.out.println(WeekDays.JOI.ordinal());

        WeekDays.LUNI.procent=222;
        System.out.println(WeekDays.LUNI.procent);

    }
}
