package charactersCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharactersCount
{
    public static void main(String[] args)
    {
        System.out.println(count("fileName4"));
    }

    static int count(String fileName)
    {
        File file = new File(fileName);
        StringBuilder reader = new StringBuilder();
        int count = 0;
        try
        {
            Scanner scan = new Scanner(file);
            int length = 0;
            while (scan.hasNextLine())
            {
                reader.append(scan.nextLine() + "\n");                      //  add line to "reader"      
                length++;                                                   // line counter
            }

            String text = reader.toString();
            char[] charsArr = text.toCharArray();

            for (int i = 0; i < charsArr.length; i++)
            {
                count++;
            }
            count = count - length;                                         // subtract lines from count (new line is normally counted as character)
        }
        
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        return count;
    }
}
