import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.00");

        System.out.print("Diameter : ");
        double D = in.nextDouble();

        double R = D / 2;
        double CArea = Math.pow(R, 2) * Math.PI;
        double CCircum = 2 * Math.PI * R;

        System.out.println("\nArea          : " + deci.format(CArea) + "\nCircumference : " + deci.format(CCircum));
        in.close();
    }
}