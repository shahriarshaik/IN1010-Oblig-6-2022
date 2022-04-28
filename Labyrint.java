import java.util.Scanner;

import java.io.File;

public class Labyrint {
    Rute[][] ruter; // [rad = y] [kolonne = x]
    // den skal ta vare på antall rader og antall kolonner
    private int y = 0; // vertikale
    private int x = 0; // horisontale

    public void lesLab(String fil) {
        String lokasjon = "labyrinter/" + fil;
        try {
            Scanner lesLabyrint = new Scanner(new File(lokasjon));
            int antallLinjer = 0; // denne funker som temp rad holder også
            while (lesLabyrint.hasNextLine()) { // første linje: 0 0, resten: #####.###
                String nextLine = lesLabyrint.nextLine();
                if (antallLinjer == 0) {
                    String[] fordeleRogK = nextLine.split(" ");
                    try {
                        //x = Integer.parseInt(fordeleRogK[0]);
                        y = Integer.parseInt(fordeleRogK[0]);
                    } catch (Exception e) {
                        System.out.println("Rad fakka opp");
                    }
                    try {
                        //y = Integer.parseInt(fordeleRogK[1]);
                        x = Integer.parseInt(fordeleRogK[1]);
                    } catch (Exception e) {
                        System.out.println("x fakka opp");
                    }
                    ruter = new Rute[y][x];
                    // System.out.println(nextLine);
                } else {
                    char[] skilleRuter = nextLine.toCharArray();
                    System.out.println("\n" + nextLine + ": ");
                    int tempKolonne = 1;
                    for (char c : skilleRuter) {
                        if (c == '#') {
                            System.out.print("# at (" + tempKolonne + "," + antallLinjer + "), ");
                            try {
                                //settInnRute(tempKolonne, antallLinjer, '#');
                                settInnRute(antallLinjer, tempKolonne, '#');
                            } catch (Exception e) {
                                System.out.println("klarte ikke å lage en svart rute at(" + tempKolonne + ","
                                        + antallLinjer + "), ");
                            }
                        } else if (c == '.') {
                            System.out.print(". at (" + tempKolonne + "," + antallLinjer + "), ");
                            try {
                                //settInnRute(tempKolonne, antallLinjer, '.');
                                settInnRute(antallLinjer, tempKolonne, '.');
                            } catch (Exception e) {
                                System.out.println("klarte ikke å lage en hvit rute at(" + tempKolonne + ","
                                        + antallLinjer + "), ");
                            }
                        }
                        tempKolonne++;
                    }
                }
                antallLinjer++;
            }
            System.out.println("\nantall rader: " + y + "\nantall kolonner: " + x);
            lesLabyrint.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public int hentKolonne() {
        return x;
    }
    public int hentRad() {
        return y;
    }
    public Rute hentRute(int x, int y) { // kolonne = x, rad = y
        // kan godt hende denne fakker opp
        try {
            Rute retur = ruter[y - 1][x - 1];
            return retur;
        } catch (Exception e) {
            // System.out.println("kunne ikke hent grunn av: \n" + e);
            return null;
        }
    }
    public Rute naboOstRegresjon(Rute rute) { // første rute = [0][0]
        Rute last = rute;
        if (hentKolonne() == rute.x) {
            return rute;
        } else {
            Rute sendeInn = hentRute(last.x + 1, last.y);
            // System.out.println(sendeInn);
            last.oest = naboOstRegresjon(sendeInn);
            return last;
        }
    }
    public Rute naboSorRegresjon(Rute rute) {
        Rute last = rute;
        if (hentRad() == rute.y) {
            return rute;
        } else {
            Rute sendeInn = hentRute(last.x, last.y + 1);
            // System.out.println(sendeInn);
            last.syd = naboSorRegresjon(sendeInn);
            return last;
        }
    }

    public void giAlleNabo() { // TODO test denne
        for (int i = 0; i < hentKolonne(); i++) {
            naboSorRegresjon(ruter[0][i]);
        }
        for (int i = 0; i < hentRad(); i++) {
            naboOstRegresjon(ruter[i][0]);
        }
    }

    public void settInnRute(int y, int x, char rute) {
        if (rute == '#') {
            ruter[y - 1][x - 1] = new SortRute(y, x, this);
        } else if (rute == '.') {
            ruter[y - 1][x - 1] = new HvitRute(y, x, this);
        }
    }

    @Override
    public String toString() {
        // TODO fiks denne toStingen etterhvert, fortsatt nulll anelse av hva som skal
        // printes ut her
        return super.toString();
    }
}
