// Doodad.java
//
// Created on Sept 30, 2009 by Dr. Joyce
// This is a "copy" of the Doodad class
// with the javadoc comments removed.
//
//**********************

public class Doodad
{
    private String name;
    private int number;
    private String color;
    private boolean likesicecream;
    private boolean injured;
    
    public Doodad() 
    {
        name = "";
        number = 0;
        color = "";
        likesicecream= false;
        injured = true;
    }
    
    public void setName(String holdname)
    {
        name = holdname;
    }
    
    public void setNumber(int holdnumber)
    {
        number = holdnumber;
    }
    
    public void setColor(String holdcolor)
    {
        color = holdcolor;
    }
    
    public void setIcecream(boolean holdlikesicecream)
    {
        likesicecream = holdlikesicecream;
    }
    
    public void setInjured(boolean holdinjured)
    {
        injured = holdinjured;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public boolean getIcecream()
    {
        return likesicecream;
    }
    
    public boolean getInjured()
    {
        return injured;
    }
    
    public String toString()
    {
          return "\nDoodad Information: \n"+
               "\tThe name of the Doodad is: "+ name +"\n"+
               "\tThe number of the Doodad is: "+ number +"\n"+
               "\tThe color of the Doodad is: "+ color +"\n"+        
               "\tIt is "+ likesicecream +" that the Doodad likes ice cream. \n"+
               "\tIt is "+ injured + " that the Doodad is injured. \n"; 

    }
    
    public String answer(String question)
    {
        String reply = "";
        
        question = question.toUpperCase();
        
           final int NUMCHOICES = 20;
           int choice = (int)(Math.random() * NUMCHOICES) + 1;
         
           if (choice == 1)
              reply = "As I see it, yes";
           if (choice == 2)
              reply = "It is certain";
           if (choice == 3)
              reply = "It is decidedly so";
           if (choice == 4)
              reply = "Most likely";
           if (choice == 5)
              reply = "Outlook good";
           if (choice == 6)
              reply = "Signs point to yes";
           if (choice == 7)
              reply = "Without a doubt";
           if (choice == 8)
              reply = "Yes";
           if (choice == 9)
              reply = "Yes - definitely";
           if (choice == 10)
              reply = "You may rely on it";
           if (choice == 11)
              reply = "Reply hazy, try again";
           if (choice == 12)
              reply = "Ask again later";
           if (choice == 13)
              reply = "Better not tell you now";
           if (choice == 14)
              reply = "Cannot predict now";
           if (choice == 15)
              reply = "Concentrate and ask again";
           if (choice == 16)
              reply = "Don't count on it";
           if (choice == 17)
              reply = "My reply is no";
           if (choice == 18)
              reply = "My sources say no";
           if (choice == 19)
              reply = "Outlook not so good";
           if (choice == 20)
              reply = "Very doubtful";
      
        return "\n" + name + " says:\n\n\t" + reply ; 
    }
    
}

