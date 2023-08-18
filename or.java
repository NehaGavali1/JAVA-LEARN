
import java.util.Scanner;
 class or{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ther passwd");
        int passwd=sc.nextInt();
        System.out.println("r-enter the password");
        int passwdr=sc.nextInt();

        int totalAttempts=sc.nextInt();
    

 while (totalAttempts == 0) {

        if (passwd == passwdr) {


            System.out.println("Login Correct!");
            return;

        } else {


            System.out.println("Incorrect Login");

            totalAttempts--;
            System.out.println(totalAttempts);

        }

    }

    if (totalAttempts == 0) {

        System.out.println("Maximum number of attempts exceeded");
    }
}


 }