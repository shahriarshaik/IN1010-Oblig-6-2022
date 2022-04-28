public class Aapning extends HvitRute {

    public Aapning(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }

    @Override
    public String toString() {
        String print = "Aapning at: (" + x + ", " + y + ")";
        return print;
    }

}
