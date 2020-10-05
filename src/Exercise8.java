
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Text : ");
        String text = in.nextLine();
        String firsthalf = text.substring(0, text.length() / 2);
        String secondhalf = text.substring(text.length() / 2);
        String finaltext = secondhalf + firsthalf;

        System.out.println("\n" + finaltext.toUpperCase() + ".");
        in.close();
    }
}