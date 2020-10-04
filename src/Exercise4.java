import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###");

        System.out.print("Centimeters : ");
        double Centimeters = in.nextDouble();

        double Km = (int) (Centimeters / 100000);
        Centimeters -= Km * 100000;
        double M = (int) (Centimeters / 100);
        Centimeters -= M * 100;
        double Cm = (int) (Centimeters);

        System.out.println("\nKilometers  : " + deci.format(Km) + "\nMeters      : " + deci.format(M) + "\nCentimeters : " + deci.format(Cm));
    }
}