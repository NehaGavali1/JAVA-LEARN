
import java.util.Scanner;
 class Assignment{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ther passwd");
        int passwd=sc.nextInt();
        System.out.println("renter the password");
        int passwd2=sc.nextInt();
        
        if(passwd == passwd2){
        System.out.println("passwd is match");
    }
        else{
        System.out.println("renter not match");
        int attempt=3;
        System.out.println("try again");
        while(attempt>0)
        {
         System.out.println("try again");   
        }
        attempt--;
        
        
        
}
}}


