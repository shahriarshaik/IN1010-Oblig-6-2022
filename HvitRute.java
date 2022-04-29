import java.util.ArrayList;

public class HvitRute extends Rute {
    public HvitRute(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }

    public char karakter = ' ';

    public char hentChar() {
        return karakter;
    }

    public void finn(Rute fra) { // TODO
        Rute start = fra;
        ArrayList<Rute> hvite = henthvite(fra);
        if (hvite.size() == 0) {
            System.out.println("ingen hvite Ruter rundt");
            System.exit(0);
        }
        for (Rute rute : hvite) {
            if (rute.x == start.x && rute.y == start.y) {

            } else {
                finn(rute); // TODO finish this one
            }
        }
    }

    @Override
    public String toString() {
        String print = "Hvit rute at: (" + x + ", " + y + ")";
        return print;
    }
}
