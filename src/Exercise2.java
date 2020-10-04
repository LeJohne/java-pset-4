import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###");

        System.out.print("Inches : ");
        double Inches = in.nextDouble();

        double Mi = (int) (Inches / 63360);
        Inches -= Mi * 63360;
        double Ft = (int) (Inches / 12);
        Inches -= Ft * 12;
        double In = (int) (Inches);

        System.out.println("\nMiles  : " + deci.format(Mi) + "\nFeet   : " + deci.format(Ft) + "\nInches : " + deci.format(In));
    }
}