
import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        System.out.println("enter ther passwd");
        System.out.println("renter the password");
        Scanner sc=new Scanner(System.in);
        int passwd=sc.nextInt();
        int passwd2=sc.nextInt();
        if(passwd==passwd2)
        System.out.println("passwd is match");
        else
        System.out.println("renter the passwd");
    }

    }

}
