package vineethpackage;
import java.util.Scanner;
public class Switch 
{
    public int n;
void getsub()
{
    System.out.println("Enter the number of subjects :");
    Scanner subvalue = new Scanner (System.in);
    n = subvalue.nextInt();
 switch(n)
 {    
            case 1:
            System.out.println("Enter english marks:");
            break;
            case 2:
            System.out.println("Enter tamil marks:");
            break;
            case 3:
            System.out.println("Enter maths marks:");
            break;
            case 4:
            System.out.println("Enter science marks:");
            break;
            case 5:
            System.out.println("Enter social marks:");
            break;
            default:
                System.out.println("Invalid Number");
            
}
            }
}

class Report
{
public static void main(String args[])
{
    Switch obj=new Switch();
    obj.getsub();

}
}
