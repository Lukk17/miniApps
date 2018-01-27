package symulatorLOTTO;

import java.util.Arrays;

public class Outcome
{
    public static int comparison(int[] randNumbers, int[] playerNumbers)
    {
        /**
         * 
         * compar randon numbers with numbers entered by player
         * 
         * 
         */

        Arrays.sort(randNumbers);                                                                                                                           //pleyerNumbers already sorted in previous function
        
        int count = 0;
        for (int i = 0; i < playerNumbers.length; i++)
        {
            for (int j = 0; j < randNumbers.length; j++)
            {
                if (randNumbers[j] == playerNumbers[i])                                                                                                        //when number in cell in randNumbers and plaeyerNumbers are same count +1 for win
                {
                    count++;
                }
            }
            
        }

        if (count == 3)
        {
            return 3;
        }
        
        else if (count == 4)
        {
            return 4;
        }
        
        else if (count == 5)
        {
            return 5;
        }
        
        else if (count == 6)
        {
            return 6;
        }

        return 0;
    }

    public static void result(int result)
    {
        /**
         * print lottery result
         * 
         * 
         */

        if (result == 3)
        {
            System.out.println("3");
        }
        
        else if (result == 4)
        {
            System.out.println("4");
        }
        
        else if (result == 5)
        {
            System.out.println("5");
        }
        
        else if (result == 6)
        {
            System.out.println("6");
        }
        
        else
        {
            System.out.println("you lose");
        }
    }
}
