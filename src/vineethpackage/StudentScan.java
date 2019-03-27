package vineethpackage;

import java.util.Scanner;

class StudentScan 
{
int sid;
String sname;

void getStudentInfo()
{
    Scanner s = new Scanner (System.in);
    System.out.println("enter student id :");
    sid =s.nextInt();
    System.out.println("enter student name :");
sname = s.next();
}
void showStudentInfo()
{
    System.out.println("student id :"+sid);
    System.out.println("student id :"+sname);
}
public static void main(String args[])
{
StudentScan st = new StudentScan ();
st.getStudentInfo();
st.showStudentInfo();
}
}
