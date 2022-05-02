import java.util.ArrayList;

public class Aapning extends HvitRute {

    public Aapning(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }

    public char karakter = ' ';

    public char hentChar() {
        return karakter;
    }

    public void finn(Rute fra) {// TODO
        if (fra == null) {
            lab.apninger.add(this);
            Rute gjeldende = this;
            ArrayList<Rute> hvite = henthvite(gjeldende);
            for (Rute rute : hvite) {
                rute.finn(this);
            }
        } else {
            System.out.println("funnet åpning: " + this);
            lab.apninger.add(this);
        }

    }

    @Override
    public String toString() {
        String print = "Aapning at: (" + x + ", " + y + ")";
        return print;
    }

}
