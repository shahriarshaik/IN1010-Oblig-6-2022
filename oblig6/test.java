public class test {
    public static void main(String[] args) {
        Labyrint lab = new Labyrint();
        lab.lesLab("1.in");
        // lab.lesLab("test3x3.txt");
        // System.out.println();
        // lab.giAlleNabo();

        // System.out.println("\nNabo øst test");
        // for (int i = 0; i < lab.hentKolonne() - 1; i++) {
        // Rute gjeldende = lab.ruter[0][i];
        // System.out.println(gjeldende + ", sin øst: " + gjeldende.oest);
        // }
        // System.out.println("\nNabo sør test");
        // for (int i = 0; i < lab.hentRad() - 1; i++) {
        // Rute gjeldende = lab.ruter[i][0];
        // System.out.println(gjeldende + ", sin sør: " + gjeldende.syd);
        // }
        // System.out.println(lab.hentRute(8, 2).hentNaboer());
        // Rute printut = lab.hentRute(8, 2);
        // System.out.println(printut.henthvite(printut));

        lab.finnUtveiFra(6, 2);

    }

}
