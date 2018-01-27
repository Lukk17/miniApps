package gameDiceSimulator;

public class DiceSelect
{
    public static int[] wordDivider(String noWhiteSpaces, String znak)
    {
        /**
         * 
         * Divide entered String and give result - int array of throws number, dice type and modificator
         * 
         * 
         */
        
        if (znak.equals("plus"))                                                                                                                                   // for xDy+z
        {
            return plus(noWhiteSpaces);
        }

        else if (znak.equals("minus"))                                                                                                                             // for xDy-z
        {
            return minus(noWhiteSpaces);
        }
        else                                                                                                                                                       // for xDy
        {
            return noSign(noWhiteSpaces);
        }
    }

    public static int[] plus(String noWhiteSpaces)
    {
        StringBuilder str = new StringBuilder();

        String[] parts = noWhiteSpaces.split("[\\+]");                                                                                                              // xDy to parts[0], z to parts[1]

        int z = Integer.parseInt(parts[1]);                                                                                                                         // save "z"

        char[] charsArr = parts[0].toCharArray();                                                                                                                   // "xDy" String  to char Arrays

        int x;
        int y;
        
        try
        {
            x = Integer.parseInt(String.valueOf(charsArr[0]));                                                                                                      // parse converted char to string into int and save it to "x"

            for (int i = 2; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                            //build number "y" from single digits

            }
            y = Integer.parseInt(str.toString());                                                                                                                   // save "y"

            if (charsArr[1] != 'D')
            {
                System.out.println("You type \"" + charsArr[1] + "\" instead of \"D\", but I assumed it is \"D\"\n");
            }
        }
        
        catch (NumberFormatException e)
        {
            x = 1;
            for (int i = 1; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                         //build number "y" from single digits

            }
            for (int i = 2; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                        //build number "y" from single digits

            }
            y = Integer.parseInt(str.toString());                                                                                                                // save "y"

            if (charsArr[0] != 'D')
            {
                System.out.println("You type \"" + charsArr[0] + "\" instead of \"D\", but I assumed it is \"D\"\n");
            }

        }

        int[] result = { x, y, z };
        return result;
    }

    public static int[] minus(String noWhiteSpaces)
    {
        StringBuilder str = new StringBuilder();

        String[] parts = noWhiteSpaces.split("[\\-]");

        int z = Integer.parseInt(parts[1]);
        char[] charsArr = parts[0].toCharArray();

        int x;
        int y;
        
        try
        {
            x = Integer.parseInt(String.valueOf(charsArr[0]));                                                                                               // parse converted char to string into int and save it to "x"

            for (int i = 2; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                     //build number "y" from single digits

            }
            y = Integer.parseInt(str.toString());                                                                                                            // save "y"

            if (charsArr[1] != 'D')
            {
                System.out.println("You type \"" + charsArr[1] + "\" instead of \"D\", but I assumed it is \"D\"\n");
            }
        }
        
        catch (NumberFormatException e)
        {
            x = 1;
            for (int i = 1; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                     //build number "y" from single digits

            }
            for (int i = 2; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                     //build number "y" from single digits

            }
            y = Integer.parseInt(str.toString());                                                                                                             // save "y"

            if (charsArr[0] != 'D')
            {
                System.out.println("You type \"" + charsArr[0] + "\" instead of \"D\", but I assumed it is \"D\"\n");
            }

        }

        int[] result = { x, y, z };
        return result;
    }

    public static int[] noSign(String noWhiteSpaces)
    {
        StringBuilder str = new StringBuilder();
        char[] charsArr = noWhiteSpaces.toCharArray();

        int x;
        int y;
        
        try
        {
            x = Integer.parseInt(String.valueOf(charsArr[0]));                                                                                              // parse converted char to string into int and save it to "x"

            for (int i = 2; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                    //build number "y" from single digits

            }
            y = Integer.parseInt(str.toString());                                                                                                            // save "y"

            if (charsArr[1] != 'D')
            {
                System.out.println("You type \"" + charsArr[1] + "\" instead of \"D\", but I assumed it is \"D\"\n");
            }
        }
        
        catch (NumberFormatException e)
        {
            x = 1;
            for (int i = 1; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                     //build number "y" from single digits

            }
            for (int i = 2; i < charsArr.length; i++)
            {

                str.append(charsArr[i]);                                                                                                                     //build number "y" from single digits

            }
            y = Integer.parseInt(str.toString());                                                                                                             // save "y"

            if (charsArr[0] != 'D')
            {
                System.out.println("You type \"" + charsArr[0] + "\" instead of \"D\", but I assumed it is \"D\"\n");
            }

        }
        int[] result = { x, y };
        return result;
    }
}
