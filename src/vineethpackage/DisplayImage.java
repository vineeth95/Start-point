package vineethpackage;
import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"sonoo.png");  
  }  
    
  public void paint(Graphics n) 
  
  {  
    n.drawImage(picture, 30,30, this);  
  }  
      
  }  