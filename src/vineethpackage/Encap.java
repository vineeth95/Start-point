//Encapsulation concept

package vineethpackage;
class Encap /*binding of properties and method inside class*/
{

    private int id;

    private String name;

    public String getName() {
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
