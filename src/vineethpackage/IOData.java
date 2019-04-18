//creates a file for a user and add notes in it.
//creates error for file name already exist



package vineethpackage;
import java.io.File;
//import java.io.FileInputStream;
//import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class FileCheck
{
    String filename = null;
    String data = null;
    boolean exists;
    void FilenameFind()
{
    File tempFile = new File("C:\\Users\\Home\\Documents\\NetBeansProjects\\JavaApplication2\\"+filename+".txt");
    exists = tempFile.exists();
}
}
class details extends FileCheck
{
    Scanner sc = new Scanner(System.in);
    void collect() throws IOException
    {
        
        FileOutputStream fo = null;
        
            System.out.println("Please create your username");
            filename = sc.nextLine();
        FilenameFind();
        
        try {
            if (true == exists)
            {
            System.out.println("Username already exist..Please enter a new name");
            filename = sc.nextLine();
            System.out.println("please enter your notes");
            data = sc.nextLine();
            File f = new File(filename +".txt");
            fo = new FileOutputStream(f);
            DataOutputStream dataop = new DataOutputStream(fo); 
            dataop.writeUTF(data);
}
else
            {
            System.out.println("please enter your notes");
            data = sc.nextLine();
            File f = new File(filename +".txt");
            fo = new FileOutputStream(f);
            DataOutputStream dataop = new DataOutputStream(fo); 
            dataop.writeUTF(data);
            }
            
            
            
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(details.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
            
    
    
    void display() throws IOException
    {
        System.out.println("Please enter your username to display details");
        filename = sc.nextLine();
        File f2 =new File (filename +".txt");
        //fo2 = new FileOutputStream(f2);
        
    }
}


public class IOData
{
    public static void main(String[] args) throws IOException
    {
        details det = new details();
        det.collect();
        
        
    }
}
