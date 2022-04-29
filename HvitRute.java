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
        if (hvite.size() == 0) { //første testen, denne sjekker om ruten ikke har noen andre hvite ruter rundt seg.
            System.out.println("ingen hvite Ruter rundt, avslutter . . . ");
            System.exit(0);
        }
        for (Rute rute : hvite) {
            if(hvite.size() == 1){ //denne sjekker om den har kommet til en dead end hvis ja så avslutter denne delen
            }
            else{            
                if (rute.x == start.x && rute.y == start.y) { // denne sjekker om Nruten den ser på er den forrige ruten 
                } 
                else {
                finn(rute); // TODO finish this one, finished ?
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
