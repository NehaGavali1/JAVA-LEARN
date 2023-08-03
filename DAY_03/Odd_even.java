package DAY_03;

import java.util.Scanner;
public class Odd_even{
  
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter your following detect odd or even");
        System.out.println("enter your number");
        number = sc.nextInt();
        if(number%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }


    }
}