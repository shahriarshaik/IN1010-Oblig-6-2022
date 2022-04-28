public class Rute {
    /*
     * Klassen Rute skal ta vare på sine koordinater (radnummer og kolonnenummer)
     * og ha en referanse til labyrinten den er en del av.
     * I tillegg skal klassen ha
     * referanser til sine eventuelle
     * nabo-ruter (nord/syd/vest/oest). Det skal ikke være mulig å opprette et
     * objekt av klassen
     * Rute, kun av subklassene
     */

    int y;
    int x;
    Labyrint lab;

    public Rute(int y, int x, Labyrint lab) {
        this.y = y;
        this.x = x;
        this.lab = lab;
    }

    Rute nord = null;
    Rute syd = null;
    Rute vest = null;
    Rute oest = null;

    public String karakter;

    public String hentChar() {
        return karakter;
    }

    public String settAutoNaboer() {
        String SNord = "tom";
        String SVest = "tom";
        String SOst = "tom";
        String SSor = "tom";

        try {
            SNord = hentRute(y - 1, x).toString();
        } catch (Exception e) {
        }
        try {
            SVest = hentRute(y, x - 1).toString();
        } catch (Exception e) {
        }
        try {
            SOst = hentRute(y, x + 1).toString();
        } catch (Exception e) {
        }
        try {
            SSor = hentRute(y + 1, x).toString();
        } catch (Exception e) {
        }

        String print = "                             nord:" + SNord + "\n"
                + "vest: " + SVest + "   " + hentRute(y, x).toString() + "         øst: " + SOst
                + "\n" + "                             sør:" + SSor;
        return print;
    }

    public String hentNaboer() {
        String SNord = "tom";
        String SVest = "tom";
        String SOst = "tom";
        String SSor = "tom";
        try {
            SNord = hentRute(y, x).nord.toString();
        } catch (Exception e) {
        }
        try {
            SVest = hentRute(y, x).vest.toString();
        } catch (Exception e) {
        }
        try {
            SOst = hentRute(y, x).oest.toString();
        } catch (Exception e) {
        }
        try {
            SSor = hentRute(y, x).syd.toString();
        } catch (Exception e) {
        }

        String print = "                             nord:" + SNord + "\n"
                + "vest: " + SVest + "   " + hentRute(y, x).toString() + "         øst: " + SOst
                + "\n" + "                             sør:" + SSor;
        return print;
    }

    public Rute hentRute(int y, int x) {
        // kan godt hende denne fakker opp
        try {
            Rute retur = lab.ruter[y - 1][x - 1];
            return retur;
        } catch (Exception e) {
            // System.out.println("kunne ikke hent grunn av: \n" + e);
            return null;
        }
    }

    @Override
    public String toString() {
        String print = "Rute at: (" + x + ", " + y + ")";
        return print;
    }

}
