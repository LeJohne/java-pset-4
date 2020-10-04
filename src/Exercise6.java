import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.00");

        System.out.print("Length : ");
        double L = in.nextDouble();
        System.out.print("Width  : ");
        double W = in.nextDouble();

        double A = L * W;
        double P = (2 * L) + (2 * W);
        double D = Math.sqrt(Math.pow(L, 2) + Math.pow(W, 2));


        System.out.println("\nArea      : " + deci.format(A) + "\nPerimeter : " + deci.format(P) + "\nDiagonal  : " + deci.format(D));
    }
}