public class SortRute extends Rute {
    public SortRute(int y, int x, Labyrint lab) {
        super(y, x, lab);
    }

    public char karakter= '#';

    @Override
    public String toString() {
        String print = "Svart rute at: (" + x + ", " + y + ")";
        return print;
    }
}
