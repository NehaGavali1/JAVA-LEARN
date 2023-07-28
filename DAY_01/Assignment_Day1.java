package DAY_01;

import java.util.Scanner;
public class Assignment_Day1{
    
    public static void main(String[] arg){
    
Scanner sc = new Scanner(System.in);
   
    
 System.out.println("enter integer");
 int num1 = sc.nextInt();

 System.out.println("enter the inter "+num1);

 System.out.println("enter your first number");
 int num2 = sc.nextInt();
 System.out.println("enter your second number");
  int num3  = sc.nextInt();

 int sum = num2+num3;

 System.out.println("total number is "+sum);

 System.out.println("enter your first float number");
 float value1 = sc.nextFloat();
 System.out.println("enter your second  float number");
 float value2 = sc.nextFloat();
 float multiple = value1+value2;

System.out.println("total number is "+multiple);


System.out.println("enter your alphabet ");
char character = sc.next().charAt(0);

 int asc = (int) character;
System.out.println("enter your ascii charracter is "+ asc);

System.out.println("follwing are quiotent and reminder ");

 System.out.println("enter your first dividend");
 int dividend = sc.nextInt();
 System.out.println("enter your first diviser");
  int diviser = sc.nextInt();

 int quiotent = dividend/diviser;
 int reminder = dividend%diviser;

 System.out.println("quiotent: "+quiotent);
 System.out.println("reminder: "+reminder);


 System.out.println("Enter the value of X and Y");  
 int x = sc.nextInt();  
 int y = sc.nextInt();  
 System.out.println("before swapping numbers: "+x +"  "+ y);  
 /*swapping */  
 int t = x;  
 x = y;  
 y = t;  
 System.out.println("After swapping: "+x +"   " + y);  
 System.out.println( );  

System.out.println("enter the value of A and B");
int A = sc.nextInt();
int B = sc.nextInt();

System.out.println("before swapping "+A+" "+B);

int swap = A;
A=B;
B = swap;

System.out.println("after swapping "+A+" "+B);




    }
}