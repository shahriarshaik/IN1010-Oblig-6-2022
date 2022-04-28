public class Aapning extends HvitRute {

    public Aapning(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }
    public String karakter= " ";
    public String hentChar() {
        return karakter;
    }
    @Override
    public String toString() {
        String print = "Aapning at: (" + x + ", " + y + ")";
        return print;
    }

}
