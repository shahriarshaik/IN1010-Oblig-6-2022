import java.util.Scanner;
import java.io.File;

public class Labyrint {
    Rute[][] ruter;
    // den skal ta vare på antall rader og antall kolonner
    private int rad = 0; // vertikale
    private int kolonne = 0; // horisontale

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
                        rad = Integer.parseInt(fordeleRogK[0]);
                    } catch (Exception e) {
                        System.out.println("Rad fakka opp");
                    }
                    try {
                        kolonne = Integer.parseInt(fordeleRogK[1]);
                    } catch (Exception e) {
                        System.out.println("kolonne fakka opp");
                    }
                    ruter = new Rute[rad][kolonne];
                    // System.out.println(nextLine);
                } else {
                    char[] skilleRuter = nextLine.toCharArray();
                    System.out.println("\n" + nextLine + ": ");
                    int tempKolonne = 1;
                    for (char c : skilleRuter) {
                        if (c == '#') {
                            System.out.print("# at (" + tempKolonne + "," + antallLinjer + "), ");
                            try {
                                settInnRute(tempKolonne, antallLinjer, '#');
                            } catch (Exception e) {
                                System.out.println("klarte ikke å lage en svart rute at(" + tempKolonne + ","
                                        + antallLinjer + "), ");
                            }
                        } else if (c == '.') {
                            System.out.print(". at (" + tempKolonne + "," + antallLinjer + "), ");
                            try {
                                settInnRute(tempKolonne, antallLinjer, '.');

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
            System.out.println("\nantall rader: " + rad + "\nantall kolonner: " + kolonne);
            lesLabyrint.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Rute hentRute(int kolonne, int rad) { // kolonne = x, rad = y
        // kan godt hende denne fakker opp
        try {
            Rute retur = ruter[rad - 1][kolonne - 1];
            return retur;
        } catch (Exception e) {
            // System.out.println("kunne ikke hent grunn av: \n" + e);
            return null;
        }
    }

    public void settInnRute(int rad, int kolonne, char rute) {
        if (rute == '#') {
            ruter[rad - 1][kolonne - 1] = new SortRute(rad, kolonne, this);
        } else if (rute == '.') {
            ruter[rad - 1][kolonne - 1] = new HvitRute(rad, kolonne, this);
        }
    }

    @Override
    public String toString() {
        // TODO fiks denne toStingen etterhvert
        return super.toString();
    }
}
