package mostPopularWords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordsSelect
{
    public static List<String> counter(List<String> list)
    {
        List<String> occuranceList = new ArrayList<>();
        int[] licznik = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))                                                                             //  camparison of element (with index i) to all rest elements in list (j elements - j starts with i, so it wont check elements backwards)
                {
                    licznik[i]++;                                                                                                //   increase counter number of word apperance
                    occuranceList.add((licznik[i] + " " + list.get(i)));                                                               //   add counter,space(to split later) and word to the list
                }
            }
        }

        List<String> topList = occuranceList.stream()
                .sorted(Collections.reverseOrder())                                                                              //  sort reverse(high number in front)
                .distinct()                                                                                                      //  save only unique words(but with number for example: "8 author" (limit size of the list - faster program)
                .collect(Collectors.toList());

        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i < topList.size(); i++)
        {
            String[] parts = topList.get(i).split(" ");                                                                         //  split number of word occurence and word
            if (i == 0)
            {
                wordsList.add(parts[0]);                                                                                               //  for first argument add number of occurance too - its max number
            }
            wordsList.add(parts[1]);                                                                                                   //  save word in list
        }

        List<String> result = wordsList.stream()
                .distinct()                                                                                                       //  save only unique words (this time without numbers)                                                      
                .limit(10)                                                                                                        //  limit to 10 most popular words
                .collect(Collectors.toList());

        return result;
    }
}
