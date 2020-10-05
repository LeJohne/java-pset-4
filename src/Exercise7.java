import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.00");

        System.out.print("Side : ");
        double S = in.nextDouble();

        double A = 6 *(Math.sqrt(3) / 4) * Math.pow(S, 2);
        double P = 6 * S;

        System.out.println("\nArea      : " + deci.format(A) + "\nPerimeter : " + deci.format(P));
    }
}