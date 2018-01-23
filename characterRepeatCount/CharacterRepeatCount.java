package characterRepeatCount;

public class CharacterRepeatCount
{
    public static void main(String[] args)
    {
        String str = "xxxyyyyybbbgd";
        System.out.println(tripple(str));

    }

    static int tripple(String str)
    {
        char[] charsArr = str.toCharArray();
        int repeat = 0;

        for (int i = 0; i < charsArr.length; i++)
        {
            int count = 1;
            for (int j = i + 1; j < charsArr.length; j++)
            {
                if (charsArr[i] == charsArr[j])
                {
                    count++;                                                    //  count repeat
                }
            }

            if (count == 3)
            {
                repeat++;                                                       // add +1 to repeat counter if there are more than 3 same letters
            }
            else if (count >= 4)
            {
                i += (count - 1);                                               // don't count if there are more than 3 repeats
            }
        }
        return repeat;
    }
}
