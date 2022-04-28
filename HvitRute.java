public class HvitRute extends Rute {
    public HvitRute(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }
    
    public String karakter= " ";
    public String hentChar() {
        return karakter;
    }

    @Override
    public String toString() {
        String print = "Hvit rute at: (" + x + ", " + y + ")";
        return print;
    }
}
