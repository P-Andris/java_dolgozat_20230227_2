package modell;

public class Dolgozo {
    private final String NEV;
    private final int KOR;
    private final char NEME;
    private int munkToltEv;

    public Dolgozo(String NEV, int KOR, char NEME) {
        this.NEV = NEV;
        this.KOR = KOR;
        this.NEME = NEME;
    }

    public Dolgozo(String NEV, int KOR, char NEME, int munkToltEv) {
        this.NEV = NEV;
        this.KOR = KOR;
        this.NEME = NEME;
        this.munkToltEv = munkToltEv;
    }

    public Dolgozo(String sor) {
        String[] adatok = sor.split(";");
        this.NEV = adatok[0];
        this.KOR = Integer.parseInt(adatok[1]);
        this.NEME = adatok[2].charAt(0);
        this.munkToltEv = Integer.parseInt(adatok[4]);
    }
}
