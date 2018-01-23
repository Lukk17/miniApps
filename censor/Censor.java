package censor;

public class Censor
{
    public static void main(String[] args)
    {
        String str = "napis zawiera zle slowo : lol";
        String[] words =
        { "zle", "lol" };
        System.out.println(censor(str, words));

    }

    static String censor(String str, String[] words)
    {
        String[] parts = str.split(" ");                                        //  split text into single verbs
        String part1 = parts[0];
        String part2 = parts[1];

        for (int i = 0; i < parts.length; i++)
        {
            for (int j = 0; j < words.length; j++)
            {

                if (parts[i].equals(words[j]))                                  //  check if this word is same as words in "words" array  
                {
                    parts[i] = "****";                                          //   change word to ****
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int k = 0; k < parts.length; k++)
        {
            result.append(parts[k] + " ");                                     //   rebuild string
        }
        
        return new String(result);
    }
}
