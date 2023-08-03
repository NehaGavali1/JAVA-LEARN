package DAY_03;
import java.util.Scanner;
public class Assignment_Day3{

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");

int number1 =sc.nextInt();
System.out.println("enter the 2nd number");
int number2 =sc.nextInt();
System.out.println("enter the 3rd number");
int number3 =sc.nextInt();

int large=number1;

if (number2>large){
   large=number2;

}
if (number3>large){
   large=number3;

}

System.out.println("The largest number is: " + large);


System.out.println("enter the following number detect postive and negetive");
int number=sc.nextInt();


if(number>0){
    System.out.println(" this is postive");
}
else if(number<0){
    System.out.println(" this  is negetive");   
}
else{
    System.out.println("sry this not number");
}

System.out.println("enter your following detect odd or even");
 System.out.println("enter your number");
 int num = sc.nextInt();

        if(num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }

 System.out.println("enter your following detect Leap year not");
 System.out.println("enter your number");
 int leap = sc.nextInt();

        if(leap%4==0){
            System.out.println("number is leap");
        }
        else{
            System.out.println("not a leap year");
        }

 System.out.println("enter your following detect vowels or not");
 System.out.println("enter your alphabet");
 char Article = sc.next().charAt(0);
 
 

        if(Article =='a'|| Article =='e'||  Article =='i'|| Article =='o' || Article =='u'){
            System.out.println("this is atricle");
        }
        else{
            System.out.println("not a article");
        }

 System.out.println("enter your following detect alphabet or not");
 System.out.println("enter your alphabet");
 char alphabet = sc.next().charAt(0);
 
 

        if((alphabet >='a'&& alphabet <='z') ||(alphabet >='A'&& alphabet <='Z' )){
            System.out.println("this is alphabet");
        }
        else{
            System.out.println("this is not alphabet");
        }


}
}