package com.example.ifgan.news;

/**
 * Created by ifgan on 12/08/2017.
 */

public class Article {

    /**
     * Name of the section
     */
    private String Section;

    /**
     * Name of the article
     */
    private String Title;

    /**
     * Website URL of the article
     */
    private String Url;

    /**
     * Constructs a new (@link Article) object.
     *
     * @param section is the section of the article
     * @param title   is the title of the article
     * @param url     is the url of the article
     */
    public Article(String section, String title, String url) {
        Section = section;
        Title = title;
        Url = url;
    }

    /**
     * Returns the section of the article
     */
    public String getSection() {
        return Section;
    }

    /**
     * Returns the title of the article
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Returns the url of the article
     */
    public String getUrl() {
        return Url;
    }
}
