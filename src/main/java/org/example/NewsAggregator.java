package org.example;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class NewsAggregator {
    public static void main(String[] args) {
        List<NewsArticle> articles = fetchNewsArticles("RSS_FEED_URL_HERE");

        for (NewsArticle article : articles) {
            System.out.println("Title: " + article.getTitle());
            System.out.println("Link: " + article.getLink());
            System.out.println("ID: " + article.getEntryID());
            System.out.println("Updated: " + article.getEntryUpdated());
            System.out.println("Author: " + article.getAuthor());
            System.out.println("Content: " + article.getEntryContent());
            System.out.println("------------------------------");
        }
    }

    private static List<NewsArticle> fetchNewsArticles(String rssFeedUrl) {
        List<NewsArticle> articles = new ArrayList<>();

        try {
            URL feedUrl = new URL(rssFeedUrl);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedUrl));

//            for (SyndEntry entry : feed.getEntries()) {
//                NewsArticle article = new NewsArticle();
//                article.setEntryTitle(entry.getTitle());
//                article.setEntryLink(entry.getLink());
//                article.setEntryID(UUID.randomUUID());
//                article.setEntryUpdated(entry.getPublishedDate());
//                article.setAuthor(entry.getAuthor());
//                article.setEntryContent(entry.getDescription().getValue());
//                articles.add(article);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return articles;
    }
}

