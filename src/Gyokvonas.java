import java.util.Scanner;

class Gyokvonas {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double diszkr;
        double x1;
        double x2;

        System.out.print("Masodfoku egyenlet gyokeinek szamitasa.\na = ");
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextDouble();
            System.out.print("b = ");
            b = scan.nextDouble();
            System.out.print("c = ");
            c = scan.nextDouble();
        }
        diszkr = b * b - 4 * a * c;

        if (diszkr >= 0.0) {
            x1 = (-b + Math.sqrt(diszkr)) / (2 * a);
            x2 = (-b - Math.sqrt(diszkr)) / (2 * a);

            System.out.println("A gyokok\nx1 = " + x1 + "\nx2 = " + x2);
        } else {
            System.out.println("Az egyenletnek nincsenek valos gyokei.");
        }
    }
}