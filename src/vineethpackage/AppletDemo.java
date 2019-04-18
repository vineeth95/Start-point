package vineethpackage;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.*;

public class AppletDemo extends Applet 

{
Image img;

public void init()
{
 img=getImage(getDocumentBase(),"file:\\C:\\Users\\Home\\Documents\\NetBeansProjects\\JavaApplication2\\build\\classes\\vineethpackage\\sam.jpg");
}

    
    public void paint(Graphics g)
    {
        g.drawImage(img,50,50,this);
    /*
    Font f = new Font ("Arial",Font.BOLD,100);
    g.setFont(f);
    g.setColor(Color.GREEN);
    g.drawString("Vineeth",100,100);
    
    Font b = new Font ("Arial",Font.ITALIC,100);
    g.setFont(b);
    g.setColor(Color.GREEN);
    g.drawString("Vineeth",400,400);
    
    
    g.setColor(Color.YELLOW);
    g.draw3DRect(200, 100, 100, 200, true);
    g.fillRect(200, 100, 100, 200);
 */   
}
            }
