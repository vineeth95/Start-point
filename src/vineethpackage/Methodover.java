//Two methods with same name but in different parent and child class

package vineethpackage;

class Methodover
{
void disp(int m)
{
System.out.println("In parent");
}
}

class Manager extends Methodover
{
void disp()
{
System.out.println("In 1st child");
}
}

class Assistant extends Manager
{
void disp()
{
System.out.println("In 2nd child");
}
}
class Overall
        
{
public static void main(String args[])

{
    Methodover obj = new Methodover();
    obj.disp(4);
    
    Manager obj1 = new Manager();
    obj1.disp(); /*if parameter is mentioned means it calls parent disp()*/
    
    Assistant obj2 = new Assistant();
    obj2.disp();
}
}