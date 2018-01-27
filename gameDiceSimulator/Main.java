package gameDiceSimulator;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        /**
         * 
         * user can choose type of dice, numbers of throws and modificator, then program will simulate that rolling and give result of it
         * 
         */

        Scanner scan = new Scanner(System.in);

        int y=0;
        int x=0;
        int z=0;
        int sum = 0;

        for (;;)
        {
            try
            {
                System.out.println("Rolling dice are in format: \"xDy+z\", or \"xDy-z\" or \"xDy\"\n\nwhere: \nx-number of rolls, \ny-dice type, \nz-modificator\n\nType of dice rolling:");
                String str = scan.nextLine();
                String noWhiteSpaces = str.replaceAll(" ", "");						                                                                                                                   // cut all spaces from entered word if there are any

                if (noWhiteSpaces.contains("+"))									                                                                                                                   // when modificator is "+"
                {
                    plus(noWhiteSpaces, x, y, z, sum);
                    break;
                }
                
                if (noWhiteSpaces.contains("-"))								                                                                                                                    	// when modificator is "-"
                {
                    minus(noWhiteSpaces, x, y, z, sum);
                    break;
                }
                
                else 												                                                                                                                                 // without any modificator
                {
                    noSign(noWhiteSpaces, x, y, z, sum);
                    break;
                }
            }
            catch (NumberFormatException e )
            {
                System.out.println("Wrong dice format. It must be: \"xDy+z\", or \"xDy-z\" or \"xDy\". Try again:\n");
            }
            catch (InputMismatchException  | ArrayIndexOutOfBoundsException  e)
            {
                System.out.println(e.getMessage());
            }
            
        }
        scan.close();
    }
    public static void plus(String noWhiteSpaces, int x, int y, int z, int sum)
    {
        int[] variableArr = DiceSelect.wordDivider(noWhiteSpaces, "plus");

        x = variableArr[0];
        y = variableArr[1];
        z = variableArr[2];

        System.out.println("dice type: " + y);
        System.out.println("number of rolls: " + x);
        System.out.println("modyficator: " + z + "\n");

        sum = Roll.sumOfRolls(x, y);
        System.out.println("sum " + (sum + z));                                                                                                                                             //add modificator "z"
    }
    
    public static void minus(String noWhiteSpaces, int x, int y, int z, int sum)
    {
        int[] variableArr = DiceSelect.wordDivider(noWhiteSpaces, "minus");
        
        x = variableArr[0];
        y = variableArr[1];
        z = variableArr[2];

        System.out.println("dice type: " + y);
        System.out.println("number of rolls: " + x);
        System.out.println("modyficator: " + z + "\n");

        sum = Roll.sumOfRolls(x, y);
        System.out.println("sum " + (sum - z));                                                                                                                                          //add modificator "z"
    }
    
    public static void noSign(String noWhiteSpaces, int x, int y, int z, int sum)
    {
        int[] variableArr = DiceSelect.wordDivider(noWhiteSpaces, "noSign");

        x = variableArr[0];
        y = variableArr[1];

        System.out.println("dice type: " + y);
        System.out.println("number of rolls: " + x + "\n");

        sum = Roll.sumOfRolls(x, y);
        System.out.println("sum " + sum);
    }
}
