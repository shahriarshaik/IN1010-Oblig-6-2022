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
        Rute gjeldende = this;
        // System.out.println("er i : " + gjeldende);
        ArrayList<Rute> hvite = henthvite(gjeldende);
        if (hvite.size() == 0) { // første testen, denne sjekker om ruten ikke har noen andre hvite ruter rundt
                                 // seg.
            System.out.println("ingen hvite Ruter rundt, avslutter . . . ");
            System.exit(0);
        }
        for (Rute rute : hvite) {
            if (hvite.size() == 1) { // denne sjekker om den har kommet til en dead end hvis ja så avslutter denne
                if (fra == null) {
                    rute.finn(this);
                    // System.out.println("dead-end ved: " + rute);
                } else {
                    // System.out.println("dead-end ved: " + rute);
                }
            } else {
                if (rute == start) { // denne sjekker om Nruten den ser på er den forrige ruten, feil her
                    // System.out.println("peker på " + rute + " burde se bort");
                } else {
                    /*
                     * gammel
                     * if (rute instanceof Aapning){
                     * System.out.println("funnet åpning: " + rute);
                     * lab.apninger.add(rute);
                     * }
                     * else { // denne fortsetter regresjonen
                     * //System.out.println("starte ny regresjon . . . ");
                     * rute.finn(this); // TODO finish this one, finished ?
                     * }
                     */
                    // ny
                    rute.finn(this); // TODO finish this one, finished ?
                }

            }

        }
    }

    @Override
    public String toString() {
        String print = "Hvit rute at: (" + x + ", " + y + ")";
        return print;
    }
}
