// using if else statement
package vineethpackage;
import java.util.Scanner;

class GenderFinder  
{
 String name;
 String finalname;
void getname()
{
    Scanner n = new Scanner(System.in);
    System.out.println("Enter your name");
    name = n.next();
    finalname = name.substring(name.length()-1);
    if((finalname.equals("a")) || (finalname.equals("i"))) 
    {
        System.out.println("The given name is a Female");
    }
    else
    System.out.println("The given name is a male");
     
    }
}

class analyze
{
public static void main(String args[])
{
GenderFinder g = new GenderFinder();
g.getname();
}
}
