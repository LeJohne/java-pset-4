
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First name  : ");
        String Fname = in.nextLine();
        System.out.print("Middle name : ");
        String Mname = in.nextLine();
        System.out.print("Last name   : ");
        String Lname = in.nextLine();

        String FInitial = Fname.substring(0 , 1);
        String MInitial = Mname.substring(0 , 1);
        String LInitial = Lname.substring(0 , 1);
        String Initial = FInitial + MInitial + LInitial;

        System.out.println("\n" + Initial.toUpperCase() + ".");
        in.close();
    }
}