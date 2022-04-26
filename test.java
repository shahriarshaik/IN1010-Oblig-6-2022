public class test {
    public static void main(String[] args) {
        Labyrint lab = new Labyrint();

        // lab.lesLab("1.in");
        lab.lesLab("test3x3.txt");

        // lab.ruter[2 - 1][2 - 1] = new SortRute(2, 2, lab);

        System.out.println();
        System.out.println(lab.hentRute(3, 1).hentNaboer());
    }

}
