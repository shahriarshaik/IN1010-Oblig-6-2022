import java.util.Scanner;

public class Oblig6 {
    public static void main(String[] args) {
        Labyrint lab = new Labyrint();
        String plass = args[0];
        lab.lesLab(plass);

        System.out.println(lab);

        Scanner brukerinput = new Scanner(System.in);
        System.out.println("Skriv inn koordinater paa formatet<kolonne> <rad> ('-1' for aa avslutte)");
        String[] inn = brukerinput.nextLine().split(" ");

        while (!inn[0].equals("-1")) {
            try {
                int rad = Integer.parseInt(inn[0]);
                int kol = Integer.parseInt(inn[1]);
                lab.finnUtveiFra(rad, kol);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Feil input!");
            }
            System.out.println("Skriv inn koordinater paa formatet<kolonne> <rad> ('-1' for aa avslutte)");
            inn = brukerinput.nextLine().split(" ");
        }
    }
}
