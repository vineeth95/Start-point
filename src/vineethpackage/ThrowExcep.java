package vineethpackage;
import java.util.Scanner;


public class ThrowExcep extends Exception //Using built in Exception class
{
static int verifyAge(int age)throws ArithmeticException //static methods can be called without object initialize
{
if (age<=18) 
{
throw new ArithmeticException("Not eligible for vote"); //creating  exception statement
}
else
{
    System.out.println("Your are eligible for vote");
}
return age; //need return type
}
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        try
            {
            System.out.println("Please enter your age");
            int age = scan.nextInt();
            verifyAge(age); //calling static methods directly without objects
            }
        catch(Exception e) // if input is not number throws exception
                {
                    System.out.println(e);
        }
    
    }
}
