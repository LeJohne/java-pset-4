import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.00");

        System.out.print("Temperature : ");
        double Temperature = in.nextDouble();

        System.out.print("Wind speed  : ");
        double WSpeed = in.nextDouble();

        double Chill = 35.74 + (0.6215*Temperature) + (((0.4275*Temperature) - 35.75) * Math.pow(WSpeed, 0.16));

        System.out.println("\nWind chill : " + deci.format(Chill) + ".");
    }
}