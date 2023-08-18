// package DAY_02;
import java.util.Scanner;
public class passwordattempt
{
    public static void main (String [] args)
    {
        final String PASSWORD = "12345";

        for (int passAttempts = 0; passAttempts < 3; passAttempts++) 
        {
            System.out.print("\nEnter Your Password: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(PASSWORD))) 
            {
                System.out.println("\nWrong Password Try Again");
            } 
            else 
            {
                System.out.println("\nWelcome!");
                break;
            }
        }
    }
}