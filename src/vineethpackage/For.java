package vineethpackage;
import java.util.Scanner;

public class For
{
public int table;    

void multiply()
{
    System.out.println("Please enter the multiplication table to display");
    Scanner t = new Scanner(System.in);
    table = t.nextInt();
    
for (int i=1;i<=10;i++)
{
    int a = table * i;
    System.out.println(table+"*"+i+" ="+a);
}
}
}

class report
{
public static void main(String args[])
{
    
    For obj = new For();
obj.multiply();
        
        }
}