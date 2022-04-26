public class HvitRute extends Rute {
    public HvitRute(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }

    @Override
    public String toString() {
        String print = "Hvit rute at: (" + kolonne + ", " + rad + ")";
        return print;
    }
}
