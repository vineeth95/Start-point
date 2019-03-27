package vineethpackage;
import java.util.Scanner;

public class DetailsExcep 
{
int i;
String name;
void collect()
{
try
{Scanner get= new Scanner (System.in);
System.out.println("Welcome to generate E-Aadhar");
    System.out.println("Please enter your Name");
name= get.next();
    System.out.println("Enter your aadhar number");
i= get.nextInt();
}
catch(Exception e)
{
    System.out.println("Sorry please enter the correct data"+e);
    
}
finally
{
    System.out.println("Success");
}
}
}
class Intro
{
public static void main(String[] args)
{
DetailsExcep d = new DetailsExcep();
d.collect();
}
}