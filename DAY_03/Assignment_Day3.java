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


    
}
}