package com.android.rafael.booklisting1;

import java.util.ArrayList;

/**
 * Created by Rafael on 7/6/2017.
 */

public class Book {
    private String mUrl;
    private ArrayList<String> mAuthor;
    private String mTitle;

    public Book(String url, ArrayList<String> author, String title) {
        mUrl = url;
        mAuthor = author;
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public ArrayList<String> getAuthor() {
        return mAuthor;
    }

    public String getTitle() {
        return mTitle;
    }
}
