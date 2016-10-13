package lotto;


public class Spieler {

    public String name;
    public int[] arr = new int[6];
    public int[] arrEinzelneRichtige = {0, 0, 0, 0, 0};
    public int richtige = 0;
    
    
    
    


    public void zaehler(int x, MyFrame jf) {
        switch (x) {
            case 1:
                this.arrEinzelneRichtige[0]++;
                jf.setEins(this.arrEinzelneRichtige[0]);
                break;
            case 2:
                this.arrEinzelneRichtige[1]++;
                jf.setZwei(this.arrEinzelneRichtige[1]);
                break;
            case 3:
                this.arrEinzelneRichtige[2]++;
                jf.setDrei(this.arrEinzelneRichtige[2]);
                break;
            case 4:
                this.arrEinzelneRichtige[3]++;
                jf.setVier(arrEinzelneRichtige[3]);
                break;
            case 5:
                this.arrEinzelneRichtige[4]++;
                jf.setFünf(arrEinzelneRichtige[4]);
                break;
        }
    }

    public void aktrichtige() {
        this.richtige++;
    }

    public void setRichtige(int richtige) {
        this.richtige = richtige;
    }

    public String getName() {
        return name;
    }

    public int[] getArr() {
        return arr;
    }

    public int getRichtige() {
        return richtige;
    }

    public Spieler(String name, int[] arr) {
        this.name = name;
        this.arr = arr;

    }

}
