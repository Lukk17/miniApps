package symulatorLOTTO;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers
{
    public static int[] playerNum()
    {
        /**
         * 
         * save numbers entered by plaeyer to array
         * 
         * 
         */
        
        int[] playerNumber = new int[6];                                                                                                                                                                    // creating an array where numbers entered by player are saved

        for (int i = 0; i < 6; i++)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("number " + (i + 1) + " :");

            for (;;)                                                                                                                                                                                        //infinite loop to catch only right numbers
            {
                while (!scan.hasNextInt())                                                                                                                                                                  //protect from entering not a number
                {
                    System.out.println("Wrong symbol, try again:");
                    scan.next();
                }
                
                int temp = scan.nextInt();

                if (temp == 0)
                {
                    System.out.println("cant be 0 try again: ");
                    playerNumber[i] = temp;
                }
                
                else if (temp == playerNumber[0] || temp == playerNumber[1] || temp == playerNumber[2] || temp == playerNumber[3] || temp == playerNumber[4] || temp == playerNumber[5])
                {
                    System.out.println("same number, try again: ");
                    playerNumber[i] = temp;
                }
                
                else if (temp > 49)
                {
                    System.out.println("too large number try again: ");
                    playerNumber[i] = temp;
                }
                
                else if (temp >= 1 && temp <= 49)
                {
                    playerNumber[i] = temp;
                    break;                                                                                                                                                                                       //when number is ok, loop is breaked and numbers is saved
                }

                else
                {
                    System.out.println("too small number try again: ");
                    playerNumber[i] = temp;
                }
            }
        }

        Arrays.sort(playerNumber);
        System.out.println(Arrays.toString(playerNumber));

        return playerNumber;
    }
}
