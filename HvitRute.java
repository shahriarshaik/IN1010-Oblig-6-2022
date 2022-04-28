public class HvitRute extends Rute {
    public HvitRute(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }
    
    public char karakter= '.';


    @Override
    public String toString() {
        String print = "Hvit rute at: (" + x + ", " + y + ")";
        return print;
    }
}
