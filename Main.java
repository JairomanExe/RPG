/**
 * @Description This is the main program that will work the magic
 * 
 * @author Jairo Chavez
 * 
 * @Date 5/24/16
 *
 */
public class Main 
{
	public static void main (String args[])
	{

	// creates a die of type Die
    Die die1;
     
     //my Die
     die1= new Die();  	  
     	 
     
     		die1.roll();							// Rolls the die
            System.out.println(die1.getValue());	// Prints out the rolled value
            System.out.println();
 
    }      
}

