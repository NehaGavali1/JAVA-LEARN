 import java.util.Scanner;
 public class odd_even{
    public static void main(String[] args){
       
        int number =17;
        String result =(number %2==0) ? "even" : "odd";
        System.out.println(result);
        
        // user input using conditional ternary

    Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        String res =(number %2==0) ? "even" : "odd";
        System.out.println("number is "+res);
    }
 }