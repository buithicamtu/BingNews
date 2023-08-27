package bingnews;

import java.sql.Date;

public class News {
    
    public static class Feed {
        private String title;
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        private String subTitle;
        public String getSubTitle() {
            return subTitle;
        }
        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }
        private String link;
        public String getLink() {
            return link;
        }
        public void setLink(String link) {
            this.link = link;
        }
        private String id;
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        private Date updated;
        public Feed(String title, String subTitle, String link, String id, Date updated) {
            this.title = title;
            this.subTitle = subTitle;
            this.link = link;
            this.id = id;
            this.updated = updated;
        }
        public Date getUpdated() {
            return updated;
        }
        private String description;
        // Constructor, getters, and setters
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class Entry {
        private String entryTitle;
        public String getEntryTitle() {
            return entryTitle;
        }
        public void setEntryTitle(String entryTitle) {
            this.entryTitle = entryTitle;
        }
        private String entryLink;
        public String getEntryLink() {
            return entryLink;
        }
        public void setEntryLink(String entryLink) {
            this.entryLink = entryLink;
        }
        private String entryID;
        public String getEntryID() {
            return entryID;
        }
        public void setEntryID(String entryID) {
            this.entryID = entryID;
        }
        private Date entryUpdated;
        public Date getEntryUpdated() {
            return entryUpdated;
        }
        public void setEntryUpdated(Date entryUpdated) {
            this.entryUpdated = entryUpdated;
        }
        private String author;
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        private String entryContent;
        public Entry(String entryTitle, String entryLink, String entryID, Date entryUpdated, String author,
                String entryContent) {
            this.entryTitle = entryTitle;
            this.entryLink = entryLink;
            this.entryID = entryID;
            this.entryUpdated = entryUpdated;
            this.author = author;
            this.entryContent = entryContent;
        }
        public String getEntryContent() {
            return entryContent;
        }
        public void setEntryContent(String entryContent) {
            this.entryContent = entryContent;
        }

    }
}


