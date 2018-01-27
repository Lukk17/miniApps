package gameDiceSimulator;

import java.util.Random;
import java.util.Scanner;

public class Roll
{
    public static int diceRoll(int y)
    {
        /**
         * 
         * simulate dice roll
         * 
         * 
         * 
         */

        Integer[] arr = new Integer[y];
        for (int i = 0; i < arr.length; i++)

        {
            arr[i] = (i + 1);
        }

        int randNumber;

        Random r = new Random();
        randNumber = r.nextInt(y);                                                                                                                                //generate "random" number from 0 to y, same as array cells

        return (arr[randNumber]);
    }

    public static int sumOfRolls(int x, int y)
    {
        /**
         * 
         * rolls dice as many times as parameter x (number of throws) indicate, and then sum it up
         * 
         */

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int j = 0; j < x; j++)                                                                                                                                  // x is how many rolling of the dice should be done
        {
            int rollNumber = 0;
            for (;;)
            {

                if (y == 3 || y == 4 || y == 6 || y == 8 || y == 10 || y == 12 || y == 20 || y == 100)                                                               //if number of dice walls is correct
                {

                    rollNumber = diceRoll(y);                                                                                                                       // simulate single roll of the dice
                    System.out.println("roll number " + rollNumber);

                    break;

                }
                else                                                                                                                                                 // if number of dice walls is incorrect
                {
                    System.out.println("You can choose between D: 3, 4, 6, 8, 10, 12, 20, 100. Try again:");
                    while (!scan.hasNextInt())
                    {
                        System.out.println("You must type only number, try again:");
                        scan.next();
                    }
                    y = scan.nextInt();
                }
            }
            sum += rollNumber;                                                                                                                                        // return only sum of drawed numbers, without modificator
        }

        return sum;
    }
}
