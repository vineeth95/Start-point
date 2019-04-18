package vineethpackage;

public class ExceptionConversion
{
void write()
{
    String sub = "1";
    int roll = 1000;
   /*
    try
    
    {
      int roll2 = roll+sub; // created for exception
   
   System.out.println("converted roll no - "+roll2);
    }
    catch (Exception e)
    {
        System.out.println("Please wait...");
   int roll3 = Integer.parseInt(sub);
        System.out.println("Numberformatexception handled - "+roll+roll3);
    }
        */
}
}


class Conversion
{
 
    public static void main(String[] args)
    {
        ExceptionConversion obj = new ExceptionConversion();
        obj.write();
        
    
    String name = "100"; //number is given as string
    int num = 10;
        System.out.println(name+num); //string concate with number
    int num1 = Integer.parseInt(name); // conversion of string into number
        System.out.println(num1+num); // adding converted number and number
    String name1 = String.valueOf(num1); // conversion of number into string
        System.out.println(name1+num); // concate string and number
         
}
}
