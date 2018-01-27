package mostPopularWords;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TitlesImport
{
    public static List<String> titlesImport()
    {
        List<String> linksList = new ArrayList<>();

        try
        {
            Connection connect = Jsoup.connect("http://www.onet.pl/");
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links)
            {
                linksList.add(elem.text());
            }

            Connection connect1 = Jsoup.connect("http://www.wp.pl/");
            Document document1 = connect1.get();
            Elements links1 = document1.select("span.title");
            for (Element elem1 : links1)
            {
                linksList.add(elem1.text());
            }
            Connection connect2 = Jsoup.connect("http://www.benchmark.pl/");
            Document document2 = connect2.get();
            Elements links2 = document2.select("span.title");
            for (Element elem2 : links2)
            {
                linksList.add(elem2.text());
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return linksList;
    }
}
