package modell;

public class Dolgozo {
    private String nev;
    private int kor;
    private char neme;
    private int munkToltEv;

    public Dolgozo(String nev, int kor, char neme) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
    }

    public Dolgozo(String nev, int kor, char neme, int munkToltEv) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.munkToltEv = munkToltEv;
    }

    public Dolgozo(String sor, String sep) {
        String[] adatok = sor.split(sep);
        this.nev = adatok[0];
        this.kor = Integer.parseInt(adatok[1]);
        this.neme = adatok[2].charAt(0);
        if(adatok.length == 4) {
            this.munkToltEv = Integer.parseInt(adatok[3]);
        }
        else {
            this.munkToltEv = 0;
        }
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public char getNeme() {
        return neme;
    }

    public int getMunkToltEv() {
        return munkToltEv;
    }
}
