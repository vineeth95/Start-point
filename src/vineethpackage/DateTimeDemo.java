package vineethpackage;

import java.time.LocalDate;
import java.time.LocalTime;


public class DateTimeDemo
{
public static void main(String[] args)
{
LocalDate d = LocalDate.now();
    System.out.println(d);
    
   LocalDate m = d.minusDays(3); 
    System.out.println(m);
    
    LocalDate my = d.minusYears(3);
    System.out.println(my);
    
    boolean l = d.isLeapYear();
    System.out.println(l);
    System.out.println(d.isLeapYear());

    LocalTime lt = LocalTime.now();
    System.out.println(lt);
    
    LocalTime td = lt.minusHours(4);
    System.out.println(td);
    
}
        
}
