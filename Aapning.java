public class Aapning extends HvitRute {

    public Aapning(int rad, int kolonne, Labyrint lab) {
        super(rad, kolonne, lab);
    }

    public char karakter = ' ';

    public char hentChar() {
        return karakter;
    }

    public void finn(Rute fra) {// TODO
        System.out.println("denne starter");
    }

    @Override
    public String toString() {
        String print = "Aapning at: (" + x + ", " + y + ")";
        return print;
    }

}
