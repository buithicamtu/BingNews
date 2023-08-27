package bingnews;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String rssUrl = "Yhttps://rss.nytimes.com/services/xml/rss/nyt/AsiaPacific.xml";
        List<News> News = NewsFetcher.fetchNews(rssUrl);

        for (News article : News) {
            System.out.println("Title: " + article.getEntryTitle());
            System.out.println("Description: " + article.getDescription());
            System.out.println("Link: " + article.getEntryLink());
            System.out.println();
        }
    }
}
