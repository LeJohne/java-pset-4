import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What's your favorite city? ");
        String Response = in.nextLine();

        System.out.println("\nText   : " + Response + "\nLength : " + Response.length() + "\nUpper  : " + Response.toUpperCase() + "\nLower  : " + Response.toLowerCase());
        in.close();
    }
}