/*
 * Doodad.java
 *
 * Created on February 5, 2008, 4:31 PM
 */
/**
 * Doodad class is a basic class representing a Doodad object.  It contains
 * variables name (string), number (integer), color (string), likesicecream
 * (boolean), and injured (boolean). It also containes setter and getter methods
 * for the above listed varaibles as well as a toString method that returns
 * all known information about the current Doodad. In the Fall of 2009 Dr. Joyce
 * added an 'answer' method, which returns a string that answers a question (it
 * is actually just random)
 *
 * @author Paolo Repole
 */
public class Doodad {
    
    /** Stores DooDads name. */
    private String name;
    
    /** Stores DooDads number. */
    private int number;
    
    /**Stores DooDads color. */
    private String color;
    
    /**
     * Represents if the Doodad likes icecream.
     */
    private boolean likesicecream;
    
    /**
     * Represents if the Doodad is injured.
     */
    private boolean injured;
    
    /**
     * Doodad constructor initializes name to blank, number to 0,
     * color to blank, likesicecream to false, and injured to true.
     */
    public Doodad() {
        name = "";
        number = 0;
        color = "";
        likesicecream= false;
        injured = true;
    }
    
    /**
     * The setName method sets the name.
     *
     *
     * @param name A string that represents the name of the Doodad.
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * The setNumber method sets the name.
     *
     *
     * @param number An integer that represents the number of the Doodad.
     */
    public void setNumber(int number){
        this.number = number;
    }
    
    /**
     * The setColor method sets the color.
     * @param color A string that represents the color of the Doodad.
     */
    public void setColor(String color){
        this.color = color;
    }
    
    /**
     * The setIcecream method sets the value of the boolean likesicecream.
     *
     *
     * @param likesicecream A boolean that represents if the Doodad likes icecream.
     */
    public void setIcecream(boolean likesicecream){
        this.likesicecream = likesicecream;
    }
    
    /**
     * The setInjured method sets the value of the boolean injured.
     *
     *
     * @param injured A boolean that represents if the Doodad in injured.
     */
    public void setInjured(boolean injured){
        this.injured = injured;
    }
    
    /**
     * The getName method returns the Doodad's name. 
     *
     * @return name a variable of type string representing the Doodad's name
     */
    public String getName(){
        return name;
    }
    
    /**
     * The getNumber method returns the Doodad's number.
     *
     * @return number a variable of type int representing the Doodad's number
     */
    public int getNumber(){
        return number;
    }
    
    /**
     * The getColor method returns the Doodad's color.
     *
     * @return color a variable of type String representing the Doodad's color
     */
    public String getColor(){
        return color;
    }
    
    /**
     * The getIcecream method returns true if the Doodad likes icecream.
     *
     * @return likesicecream a variable of type boolean representing if the 
     *         Doodad likes icecream. Expected to return ture if the Doodad 
     *         does like icecream.
     */
    public boolean getIcecream(){
        return likesicecream;
    }
    
    /**
     * The getInjured method returns true if the Doodad is injured.
     * @return injured a variable of type boolean representing if the 
     *         Doodad is injured. Expected to return ture if the Doodad is
     *         injured or unable to opperate.
     */
    public boolean getInjured(){
        return injured;
    }
    
    /**
     * The toString method gives all the basic information about a Doodad.
     *
     * @return A String representation of Doodad.
     */
    public String toString(){
        
        return "\nDoodad Information: \n"+
               "\tThe name of the Doodad is: "+ name +"\n"+
               "\tThe number of the Doodad is: "+ number +"\n"+
               "\tThe color of the Doodad is: "+ color +"\n"+        
               "\tIt is "+ likesicecream +" that the Doodad likes ice cream. \n"+
               "\tIt is "+ injured + " that the Doodad is injured. \n"; 
    }
	 
    /**
     * The answer method returns an answer to the Yes/No question passed in as a 
	  * parameter. 
     *
     * @param question A String that represents the question being asked
     * @return A String representation of the answer.
     */
    public String answer(String question)
	 {
		  String reply = "I will show you this later maybe -- Dr. Joyce";
		  
        return reply ; 
    }
	 
	 
}
