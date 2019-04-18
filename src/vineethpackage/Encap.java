//Encapsulation concept

package vineethpackage;
class Encap /*binding of properties and method inside class*/
{
//right click inside the class > select insert code > add property > select getter and setter option
    
    private int id; //private variables that can be used only inside method

    private String name;

    public String getName() //public methods inside a class
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static void main(String[] args)
   {
   Encap object = new Encap();
   object.setId(100);
   object.setName("vineeth");
       System.out.println("emp name is :" +object.getName());
   System.out.println("emp id is :" +object.getId());
   }
}
