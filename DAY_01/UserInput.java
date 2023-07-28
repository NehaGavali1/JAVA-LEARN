package DAY_01;

import java.util.Scanner;
public class UserInput{
public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    // variable
    String Address;
    String name;
    int age;
    float height;

    System.out.println("enter your Address");
    Address=sc.nextLine();
    System.out.println("enter your name");
    name=sc.next();
    System.out.println("enter your Age");
    age=sc.nextInt();
    System.out.println("enter your height");
    height=sc.nextFloat();

    System.out.println("show the output");
    System.out.println("enter your Address"+Address);
    System.out.println("enter your name"+name);
    System.out.println("enter your Age"+age);
    System.out.println("enter your height"+height);
                          
  }
}