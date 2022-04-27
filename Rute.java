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

    int rad;
    int kolonne;
    Labyrint lab;

    public Rute(int rad, int kolonne, Labyrint lab) {
        this.rad = rad;
        this.kolonne = kolonne;
        this.lab = lab;
    }

    Rute nord = null;
    Rute syd = null;
    Rute vest = null;
    Rute oest = null;

    public String settAutoNaboer() {
        String SNord = "tom";
        String SVest = "tom";
        String SOst = "tom";
        String SSor = "tom";

        try {
            SNord = hentRute(rad - 1, kolonne).toString();
        } catch (Exception e) {
        }
        try {
            SVest = hentRute(rad, kolonne - 1).toString();
        } catch (Exception e) {
        }
        try {
            SOst = hentRute(rad, kolonne + 1).toString();
        } catch (Exception e) {
        }
        try {
            SSor = hentRute(rad + 1, kolonne).toString();
        } catch (Exception e) {
        }

        String print = "                             nord:" + SNord + "\n"
                + "vest: " + SVest + "   " + hentRute(rad, kolonne).toString() + "         øst: " + SOst
                + "\n" + "                             sør:" + SSor;
        return print;
    }

    public String hentNaboer() {
        String SNord = "tom";
        String SVest = "tom";
        String SOst = "tom";
        String SSor = "tom";
        try {
            SNord = hentRute(rad, kolonne).nord.toString();
        } catch (Exception e) {
        }
        try {
            SVest = hentRute(rad, kolonne).vest.toString();
        } catch (Exception e) {
        }
        try {
            SOst = hentRute(rad, kolonne).oest.toString();
        } catch (Exception e) {
        }
        try {
            SSor = hentRute(rad, kolonne).syd.toString();
        } catch (Exception e) {
        }

        String print = "                             nord:" + SNord + "\n"
                + "vest: " + SVest + "   " + hentRute(rad, kolonne).toString() + "         øst: " + SOst
                + "\n" + "                             sør:" + SSor;
        return print;
    }

    public Rute hentRute(int rad, int kolonne) {
        // kan godt hende denne fakker opp
        try {
            Rute retur = lab.ruter[rad - 1][kolonne - 1];
            return retur;
        } catch (Exception e) {
            // System.out.println("kunne ikke hent grunn av: \n" + e);
            return null;
        }
    }

    @Override
    public String toString() {
        String print = "Rute at: (" + kolonne + ", " + rad + ")";
        return print;
    }

}
