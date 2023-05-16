import java.util.Scanner;

/*bekeri a felhasznalotol egy ketdimenzios valos erteku vektor koordinatait, valamint egy szoget fokban,
es kiirja a kepernyore annak a vektornak a koordinatait, amely az eredeti vektor adott szoggel torteno 
elforgatasanak eredmenye*/

class Vektor {
    public static void main(String[] args) {

        double xUj;
        double xRegi;
        double yUj;
        double yRegi;
        double alfa;

        System.out.print("X=");
        try (Scanner keyboard = new Scanner(System.in)) {
            xRegi = keyboard.nextDouble();

            System.out.print("Y=");
            yRegi = keyboard.nextDouble();

            System.out.print("Alfa=");
            alfa = keyboard.nextDouble();
        }
        alfa = alfa * Math.PI / 180.0; // a felhasznalool kapott szoget radianba kell konvertalni.

        xUj = xRegi * Math.cos(alfa) - yRegi * Math.sin(alfa);
        yUj = xRegi * Math.sin(alfa) + yRegi * Math.cos(alfa);

        System.out.println("X uj = " + xUj);
        System.out.println("Y uj = " + yUj);

    }
}