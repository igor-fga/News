package com.example.ifgan.news;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ifgan on 12/08/2017.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);

        String articleTitle = currentArticle.getTitle();
        String articleSection = currentArticle.getSection();

        titleView.setText(articleTitle);
        sectionView.setText(articleSection);

        return listItemView;

    }
}
