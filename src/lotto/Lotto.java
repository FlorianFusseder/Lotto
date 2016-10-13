package lotto;


public class Lotto {

    public static void main(String[] args) {

        boolean Schleife = false;
        long anzahlZiehung = 0;
        Lottomaschine ma = new Lottomaschine();
        MyFrame jf = new MyFrame();

        Spieler[] mitspieler = {
            new Spieler(jf.getSpielerName(), jf.getSpielerZahlen())
        };

        while (!Schleife) {
            anzahlZiehung++;
            jf.setK(anzahlZiehung);
            ma.ziehung();
            ueberpruefungzahlen(anzahlZiehung, mitspieler, ma);
            Schleife = ueberpruefungrichtige(ma, mitspieler, anzahlZiehung, jf);

            for (Spieler ele : mitspieler) {
                ele.setRichtige(0);
            }

        }

    }

    public static void ueberpruefungzahlen(long anzahlZiehung, Spieler[] mitspieler, Lottomaschine ma) {

        for (Spieler elemente : mitspieler) {

            for (int y = 0; y < elemente.arr.length; y++) {
                if (elemente.arr[y] == ma.auswahl[0]) {
                    elemente.aktrichtige();

                }

            }

            for (int y = 0; y < elemente.arr.length; y++) {
                if (elemente.arr[y] == ma.auswahl[1]) {
                    elemente.aktrichtige();

                }

            }

            for (int y = 0; y < elemente.arr.length; y++) {
                if (elemente.arr[y] == ma.auswahl[2]) {
                    elemente.aktrichtige();

                }

            }

            for (int y = 0; y < elemente.arr.length; y++) {
                if (elemente.arr[y] == ma.auswahl[3]) {
                    elemente.aktrichtige();

                }

            }

            for (int y = 0; y < elemente.arr.length; y++) {
                if (elemente.arr[y] == ma.auswahl[4]) {
                    elemente.aktrichtige();

                }

            }

            for (int y = 0; y < elemente.arr.length; y++) {
                if (elemente.arr[y] == ma.auswahl[5]) {
                    elemente.aktrichtige();

                }

            }

        }

    }

    public static boolean ueberpruefungrichtige(Lottomaschine m, Spieler[] mitspieler, long anzahlZiehung, MyFrame jf) {

        for (Spieler elemente : mitspieler) {

            if (elemente.richtige == 6) {
                              
                jf.SetText3(elemente.getName() + " hat 6 Richtige nach " + anzahlZiehung + " Ziehungen");
                jf.SetText31("Das entspricht " + anzahlZiehung / 52 + " Jahren und " + anzahlZiehung % 52 + " Wochen bei einer Ziehung pro Woche");

                return true;
            } else {

                elemente.zaehler(elemente.richtige, jf);

            }

        }

        return false;

    }

}
