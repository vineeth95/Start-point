package testing;
public class replacestring 
{

public static void main(String[] args)
{
String str = "#7,777";
    String str1 = str.replaceAll("#","");
    String str2 = str1.replaceAll(",","");
    
    System.out.println(str2);
}
}
