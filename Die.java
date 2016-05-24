import java.util.Random;
/**
 * This program emulates one 21-sided die.
 * 
 * Jairo Chavez
 * 
 * 5/24/16
 **/ 
public class Die
{ 
  // Variables
  public static final int SIDES=21;
  private int value;

  
 // constructor
 public Die()
 	{
	 roll();
	}
  

 
 /**
   * reads the current value of the die
   * returns 1-21
   */
 public int getValue()
 	{
	 return value;
 	}

 
  
 /**
   * emulates rolling of the die
   * stores the result in value
   */
  public void roll()
  	 { 
      Random rand;
      rand=new Random();
      value= 1+rand.nextInt(SIDES);
  	 }
  
 }
      
  
    
  

