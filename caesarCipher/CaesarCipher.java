package caesarCipher;

public class CaesarCipher
{
    public static void main(String[] args)
    {
        String str = "szyfr Cezara";
        int shift = 5;
        System.out.println(encode(str, shift));
        System.out.println(decode(encode(str, shift), shift));
    }

    static String encode(String str, int shift)
    {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++)
        {
            int character = charArr[i];                                                                                                                                     //   cast char into number

            int sum = character + shift;

            if (Character.isUpperCase(charArr[i]))
            {
                if (sum > 90)                                                                                                                                                //   reset numering from 'a' for characters with will "cross" character 'z' (ASCI number is greater than 90)
                {
                    int difference = 90 - character;                                                                                                                         //    continue numering from 'a' with whats left of shift (difference)
                    character = 65 + (shift - difference - 1);                                                                                                               //    cast number into char
                    charArr[i] = (char) character;
                }
                else
                {
                    character += shift;                                                                                                                                      //     if ASCI number after shift is no more than 90 just add shift number to char number
                    charArr[i] = (char) character;
                }
            }
            
            if (Character.isLowerCase(charArr[i]))
            {
                if (sum > 122)
                {
                    int difference = 122 - character;
                    character = 97 + (shift - difference - 1);
                    charArr[i] = (char) character;
                }
                else
                {
                    character += shift;
                    charArr[i] = (char) character;
                }
            }
        }
        
        return new String(charArr);
    }

    static String decode(String str, int shift)
    {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++)
        {
            int character = charArr[i];

            int sum = character - shift;

            if (Character.isUpperCase(charArr[i]))
            {
                if (sum < 65)                                                                                                                               //     reverse as in encoding
                {
                    int difference = 65 - (character - shift);
                    character = (90 - difference + 1);
                    charArr[i] = (char) character;
                }

                else
                {
                    character -= shift;
                    charArr[i] = (char) character;
                }
            }

            if (Character.isLowerCase(charArr[i]))
            {
                if (sum < 97)
                {
                    int difference = 97 - (character - shift);
                    character = (122 - difference) + 1;
                    charArr[i] = (char) character;
                }
                
                else
                {
                    character -= shift;
                    charArr[i] = (char) character;
                }
            }
        }

        return new String(charArr);
    }
}
