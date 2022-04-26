public class SortRute extends Rute {
    public SortRute(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }

    @Override
    public String toString() {
        String print = "Svart rute at: (" + kolonne + ", " + rad + ")";
        return print;
    }
}
