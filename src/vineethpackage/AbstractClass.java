package vineethpackage;
import java.util.Scanner;

abstract public class AbstractClass 
{
abstract void calculate(int a,int b,int c);

}

class verify extends AbstractClass
{
void calculate(int a,int b,int c)
{
int p = a;
int n = b;
int r = c;

int si = (p*n*r)/100;
    System.out.println("Your Simple interest -"+si);
}
}

class Bank
{
public static void main(String[] args)
{
    verify obj = new verify();
    
Scanner details = new Scanner (System.in);
    System.out.println("Welcome to Axis bank");
    System.out.println("Please enter the following details to calculate Simple Interest");
    System.out.println("Enter your Amount for loan");
    int a = details.nextInt();
    System.out.println("Enter your number of months");
    int b = details.nextInt();
    System.out.println("Enter your rate of interest");
    int c = details.nextInt();
obj.calculate(a, b, c);
}
}