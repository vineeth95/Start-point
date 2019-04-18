package vineethpackage;

import java.applet.*;

import java.awt.*;

public class appletImage extends Applet

  {

    Image pic;

   
    public void init()

      {

        pic =getImage(getCodeBase(), "C:\\bmw.jpg");

      }

    public void paint(Graphics grp)

      {

        grp.drawImage(pic, 0,0,this);

      }

  }