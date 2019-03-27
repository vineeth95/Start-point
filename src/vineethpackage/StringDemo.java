package vineethpackage;

public class StringDemo 
{
public static void main(String args[])
{
String a = "Mahendra";
String b = "Singh Dhoni";
String c = "Mahend";
   
    System.out.println(a.toLowerCase());/*converts to lower case*/
    System.out.println(a.toUpperCase());/*converts to UPPERCASE*/
    System.out.println(a.length());/*shows the length of string*/
    System.out.println(a.substring(1,4));/*prints the char in that range*/
    System.out.println(a.concat(b)); /*Joins two strings*/
    System.out.println(b.charAt(b.length()-1));/*represents last char of the string*/
    System.out.println(a.codePointAt(2)); /*represents code values like ASCII or Unicode*/
    System.out.println(a.codePointBefore(1)); /*Code value of before char i.e "M"*/
    System.out.println(a.compareTo(c));
    
    StringBuilder s = new StringBuilder("Vineeth");
    System.out.println(s.append("Bentley"));
    System.out.println(s.insert(2, "Last"));
    System.out.println(s.reverse());
    System.out.println(s.delete(1, 5));
 
       StringBuffer buf = new StringBuffer("Buffertest");
    System.out.println(buf.append("Addwith"));
    System.out.println(buf.insert(2, "end"));
    System.out.println(buf.reverse());
    System.out.println(buf.delete(1, 5));
}
}