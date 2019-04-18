package vineethpackage;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class IOClass 

{
    public static void main(String[] args) throws Exception
    {
        File f = new File ("Vin.txt");
        FileOutputStream fo = new FileOutputStream("Vin.txt");
        DataOutputStream dataop = new DataOutputStream(fo);
        dataop.writeUTF("Writing inside the file"); 
        
        FileInputStream fi = new FileInputStream("Vin.txt");
        DataInputStream datain = new DataInputStream(fi);
        String str = datain.readUTF();
        System.out.println(str);
        
        
    }
    
}
