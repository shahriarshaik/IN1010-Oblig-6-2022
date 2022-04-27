public class test {
    public static void main(String[] args) {
        Labyrint lab = new Labyrint();

        lab.lesLab("1.in");
        // lab.lesLab("test3x3.txt");

        System.out.println();
        lab.naboOstRegresjon(lab.hentRute(1, 1));

        /*
         * System.out.println(lab.hentRute(1, 1) + ", sin øst: " + lab.hentRute(1,
         * 1).oest.toString());
         * System.out.println(lab.hentRute(2, 1) + ", sin øst: " + lab.hentRute(2,
         * 1).oest.toString());
         */

        System.out.println();
        lab.naboSorRegresjon(lab.hentRute(1, 1));
        /*
         * System.out.println(lab.hentRute(1, 1) + ", sin sør: " + lab.hentRute(1,
         * 1).syd.toString());
         * System.out.println(lab.hentRute(1, 2) + ", sin sør: " + lab.hentRute(1,
         * 2).syd.toString());
         */

        System.out.println("\nNabo øst test");
        for (int i = 0; i < lab.hentKolonne() - 1; i++) {
            System.out.println(lab.ruter[0][i] + ", sin øst: " + lab.ruter[0][i].oest);
        }

        System.out.println("\nNabo sør test");
        for (int i = 0; i < lab.hentRad() - 1; i++) {
            System.out.println(lab.ruter[i][0] + ", sin sør: " + lab.ruter[i][0].syd);
        }
    }

}
