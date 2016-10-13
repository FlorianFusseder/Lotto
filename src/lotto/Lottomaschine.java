package lotto;

import java.util.Random;

public class Lottomaschine {

    public int[] auswahl = new int[6];

    public void ziehung() {

        int x = 0;
        int i = 0;
        boolean check = true;

        while (i < 6) {

            x = zug();
            check = check(x, auswahl, i);

            if (check) {
                auswahl[i] = x;
                i++;
            }

        }

    }

    public boolean check(int x, int[] auswahl, int i) {

        for (int ele : auswahl) {
            if (ele == x) {
                return false;
            }
        }

        return true;

    }

    public int zug() {
        Random ziehung = new Random();
        return ziehung.nextInt(49 + 1);
    }

    public void getAuswahl() {
        for (int zahlen : auswahl) {
            System.out.println(zahlen);
        }
    }

    public int zahl1() {
        return auswahl[0];
    }

    public int zahl2() {
        return auswahl[1];
    }

    public int zahl3() {
        return auswahl[2];
    }

    public int zahl4() {
        return auswahl[3];
    }

    public int zahl5() {
        return auswahl[4];
    }

    public int zahl6() {
        return auswahl[5];
    }

}
