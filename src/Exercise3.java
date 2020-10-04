import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.##");

        System.out.print("Length   : ");
        double L = in.nextDouble();
        System.out.print("Width    : ");
        double W = in.nextDouble();
        System.out.print("Diameter : ");
        double D = in.nextDouble();

        double A = L * W;
        double R = D / 2;
        double CArea = Math.pow(R, 2) * Math.PI;
        double Area = A - CArea;

        System.out.println("\nSurface area : " + deci.format(Area));
    }
}