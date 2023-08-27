package bingnews;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class NewsFetcher {
    public static List<News> fetchNews(String rssUrl) {
        List<News> newsList = new ArrayList<>();
        try {
            URL url = new URL(rssUrl);
            XmlReader reader = new XmlReader(url);
            SyndFeedInput feedInput = new SyndFeedInput();
            SyndFeed syndFeed = feedInput.build(reader);
            for (SyndEntry entry : syndFeed.getEntries()) {
                News article = new News();
                article.setTitle(entry.getTitle());
                article.setDescription(entry.getDescription().getValue());
                article.setLink(entry.getLink());
                newsList.add(article);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newsList;
    }
}
