package programQuessNumber;

import java.util.Scanner;

public class ProgramGuessNumber
{
    public static void main(String[] args)
    {
        /**
         * 
         * Program guess a number from 1 to 1000
         * 
         */

        System.out.println("Think of number from 0 to 1000 and I will guess it in 10 tries\n");

        int min = 0;
        int max = 1000;

        Scanner scan = new Scanner(System.in);

        for (;;)
        {
            int guess = (max - min) / 2 + min;						                                                                                                	//algorithm

            System.out.println("Is " + guess + " correct guess?");
            String temp = scan.next();

            if (temp.equals("yes"))
            {
                System.out.println("I won!");
                break;											                                                                                                       	//if number is quessed loop is breaked and program ends
            }

            else if (temp.equals("no"))
            {
                System.out.println("to much?");
                temp = scan.next();

                if (temp.equals("yes"))
                {
                    max = guess;										                                                                                                  // if number is to high, that number is new max
                }

                else if (temp.equals("no"))
                {
                    System.out.println("to less?");
                    temp = scan.next();

                    if (temp.equals("yes"))
                    {
                        min = guess;								                                                                                                	// if number is to low, that number is new min
                    }

                    else if (temp.equals("no"))
                    {
                        System.out.println("Don't cheat!");		                                                                                                      	// if plaeyer want to cheat
                    }

                    else
                    {
                        System.out.println("You must enter \"yes\" or \"no\". Try again:");
                    }
                }

                else
                {
                    System.out.println("You must enter \"yes\" or \"no\". Try again:");
                }
            }

            else
            {
                System.out.println("You must enter \"yes\" or \"no\". Try again:");
            }
        }
    }
}
