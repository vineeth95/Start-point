package vineethpackage;
import java.util.Scanner;

public class ExceptionDem
{
public static void main(String args[])
{
int i,j,k = 0;
try
{
Scanner s =new Scanner (System.in);   
System.out.println("Enter the 1st num :");
i = s.nextInt();
System.out.println("Enter the 2nd num :");
j = s.nextInt();
k=i/j;
System.out.println("value of k:"+k);

}
catch(Exception e){
    System.out.println(e);
System.out.println("Success");
}
}
}