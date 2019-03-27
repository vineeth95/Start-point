//do while loop

package vineethpackage;
import java.util.Scanner;

class WhileCondition
{
    int salary;
    String name1;
    int age;
    void getinfo()
    {
    Scanner s = new Scanner (System.in);
    System.out.println("Welcome to Axis bank");
    System.out.println("Please enter your name");
    name1 = s.next();
    System.out.println("Enter your age :");
    age = s.nextInt();
    System.out.println("Enter your salary :");
    salary = s.nextInt();
        do
        {
            System.out.println("Loading...");
            break;
    }
        while(salary>20000);
                {
                   System.out.println("You are eligible for applying loan");
                }
                }
}

class Eligible
{
public static void main(String args[])
{
WhileCondition intro = new WhileCondition();
intro.getinfo();
}
}