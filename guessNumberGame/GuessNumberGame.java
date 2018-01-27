package guessNumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame 
{
	public static void main (String[] args)
	{
		/**
		 * 
		 * Guess a number game
		 * 
		 * 
		 */
		
		int randNumber;
    	
    	Random r = new Random(); 				
    	randNumber = r.nextInt(101)+1;				                                                                                         	//generate "random" number from 1 to 100
    	
		try
		{		
			Scanner scan = new Scanner(System.in);
			System.out.println("Try to guess a number from 1 to 100: ");
			while(!scan.hasNextInt())			
	    	{
	    		System.out.println("Wrong number, try again:");
	    		scan.next();
	    	}
			
	    	int number = scan.nextInt();
	    	
  	
	    	for (; ;)
	    	{
	    		if(number==randNumber)
		    	{
		    		System.out.println("Good!");
		    		break;
		    	}
		    	else if (number<randNumber)
		    	{
		    		System.out.println("Too small number!");
		    		number = scan.nextInt();
		    	}
		    	else if ( number>randNumber)
		    	{
		    		System.out.println("Too big number!");
		    		number = scan.nextInt();
		    	}
			}
		}
		
		catch (NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
