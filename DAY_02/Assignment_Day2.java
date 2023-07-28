package DAY_02;
import java.util.Scanner;
public class Assignment_Day2{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("enter your birth date");
    int date = sc.nextInt();

    System.out.println("enter your birth month");
    int month = sc.nextInt();

    System.out.println("enter your  birth year");
    int year = sc.nextInt();

    System.out.println("birth date is "+date+""+month+""+year);

    // today date

    System.out.println("enter your date");
    int date1 = sc.nextInt();

    System.out.println("enter your month");
    int month1 = sc.nextInt();

    System.out.println("enter your year");
    int year1 = sc.nextInt();

    System.out.println("birth date is "+date1+" "+month1+" "+year1);

    int calculate1 = date1-date;
    int calculate2 = month-month1;
    int calculate3 = year1-year;

    System.out.println("calculate age is "+calculate3+" years "+calculate2+" month "+calculate1+" days");
    System.out.println("calculate age is "+(calculate3/(1000l*60*60*24*365))+" YEARS ");
    System.out.println("calculate age is "+(calculate1/ (1000*60*60*24)) % 365+" DAYS ");

    }
}
