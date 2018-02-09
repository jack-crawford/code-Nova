//*********************************************************************
//  ImageGen01.java         By Dale/Joyce/Weems               Chapter 1
//
//  Demonstrates image generation 
//  
//*********************************************************************
package ch01.apps;
import java.awt.image.*;
import java.awt.Color;
import java.io.*;
import java.util.Random;

import javax.imageio.*;

public class ImageGen01
{
   public static void main (String[] args)
   {
      //String fileOut = args[0];   // destination file
      String fileOut = "outPhoto.jpg";
      // create BufferedImage of SIZE and TYPE
      final int SIDE = 1024;
      final int TYPE = BufferedImage.TYPE_INT_RGB;
      BufferedImage image = new BufferedImage(SIDE, SIDE, TYPE);
      
      final int LIMIT = 255; // limit of RGB values
      int c;   
      int r,g,b;
      
      // specific value for R G and B
      Color color;
      Random randy = new Random();
      for (int i = 0; i < SIDE; i++)
        for (int j = 0; j < SIDE; j++)
        {
           c = (i + j) % LIMIT;
           r = randy.nextInt(255);
           g = randy.nextInt(255);
           b = randy.nextInt(255);
           color =  new Color(c, g, b);  // creates 'gray' values
           image.setRGB(i, j, color.getRGB());  // saves pixel
        }   

      try  // write image to file
      {
         File outputfile = new File(fileOut);
         ImageIO.write(image, "jpg", outputfile);
      } 
      catch (IOException e) 
      {
          System.out.println("could not save file ...");
      }
   }
}