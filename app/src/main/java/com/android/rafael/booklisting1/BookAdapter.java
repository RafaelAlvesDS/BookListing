package com.android.rafael.booklisting1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.path;

/**
 * Created by Rafael on 7/6/2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    String authors;

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        Book currentBook = getItem(position);
        authors = "";
        for (int i = 0; i < currentBook.getAuthor().size();i++){
            if(i > 0){
                authors += ", ";
            }
            authors += currentBook.getAuthor().get(i);
        }
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);

        authorView.setText(authors);

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentBook.getTitle());
        return listItemView;
    }
}
