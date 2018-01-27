package mostPopularWords;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextEdit
{
    public static List<String> textDivider(List<String> list)
    {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            String[] p = list.get(i).split(" ");                                                    //  split every string in list

            for (int j = 0; j < p.length; j++)
            {
                char[] char1 = p[j].toCharArray();                                                  //  changing string to charArray
                if (char1.length > 3)                                                               //  check if have more than given number of letters
                {
                    result.add(p[j]);                                                               //  adding to new list
                }
            }
        }

        return result;
    }
    
    public static List<String> removeExcludedElements(List<String> strList, String excludedElements)
    {
        List<String> result = strList.stream().map(s -> s.replaceAll(excludedElements, "")).collect(
                Collectors.toList());

        return result;

    }
}
