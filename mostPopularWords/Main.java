package mostPopularWords;

import java.util.List;

public class Main
{
    public final static String EXCLUDED_ELEMENTS = "[\\!?,\"\\/\\-()#.:,\\[\\]]";

    public static void main(String[] args)
    {
        List<String> topWords = TextEdit.removeExcludedElements(TitlesImport.titlesImport(), EXCLUDED_ELEMENTS);
        List<String> popularWords = TextEdit.textDivider(topWords);
        List<String> mostPopularWords = WordsSelect.counter(popularWords);

        System.out.println("Number of titles: " + topWords.size() + "\n");
        Output.writeToFile(popularWords, mostPopularWords);
        Output.showOnConsole(mostPopularWords);
    }
}
