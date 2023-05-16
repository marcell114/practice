import java.util.Scanner;

class Atlagszamitas {
    public static void main(String args[]) {
        double szam;
        double osszeg;
        osszeg = 0.0;
        int N = 0;

        System.out.print("Adj meg egy szamot (a legvegen: 0): ");
        Scanner scan = new Scanner(System.in);
        szam = scan.nextDouble();

        while (szam != 0.0) {
            osszeg += szam;
            N++;
            System.out.print("Adj meg egy szamot (a legvegen: 0): ");
            szam = scan.nextDouble();
        }
        if (N > 0) {
            System.out.print("Atlag: \n" + osszeg);

        } else {
            System.out.println("Nincs Atlag. :( ");
        }
    }
}
// NEM MUKODIK!!!!!!!!
// Nem szamolja az atlagot :(