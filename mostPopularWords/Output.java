package mostPopularWords;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Output
{
    public static void writeToFile(List<String> popularWords, List<String> mostPopularWords)
    {
        try
        {
            FileWriter file = new FileWriter("most_popular_words.txt", false);
            for (int i = 0; i < mostPopularWords.size(); i++)
            {
                if (i == 0)
                {
                    file.append("Occurrence number of \"" + mostPopularWords.get(i + 1) 
                            + "\" - most popular word, used in website's article's titles: " 
                            + mostPopularWords.get(i) + "\n" + "Most popular words:\n\n");
                }

                else
                {
                    file.append(mostPopularWords.get(i)).append("\n");
                }
            }

            file.close();

            FileWriter file2 = new FileWriter("popular_words.txt", false);
            for (int i = 0; i < popularWords.size(); i++)
            {
                file2.append(popularWords.get(i)).append("\n");
            }

            file2.close();

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

    public static void showOnConsole(List<String> mostPopularWords)
    {
        for (int i = 0; i < mostPopularWords.size(); i++)
        {
            if (i == 0)
            {
                System.out.print("Occurrence number of \"" + mostPopularWords.get( i + 1) 
                        + "\" - most popular word, used in website's article's titles: " 
                        + mostPopularWords.get(i) + "\n" + "Most popular words:\n\n");
            }

            else
            {
                System.out.print(mostPopularWords.get(i) + "\n");
            }
        }
    }
}
