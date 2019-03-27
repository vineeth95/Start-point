package vineethpackage;

class ShiftDemo
{
   public static void main(String args[])
   {
   int i=10;
   int j=5;
   //System.out.println(i<<2); /*multiply by 2to the power 2 i.e 10*4 = 40*/
   //System.out.println(i>>2); /*divides by 2to the power 2 i.e 10/4 = 2*/
   //System.out.println(i>>3); /*divides by 2to the power 3 i.e 10/8 = 1*/
   
   //System.out.println(i++);
   //System.out.println(i++);
   System.out.println(i++ + ++i);
   System.out.println(i++ + ++j);
   System.out.println(i++ + ++j + ++i);
   }
}