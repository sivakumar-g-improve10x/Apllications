package com.improve10x.apllications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class GmailArrayAdapter extends BaseAdapter{
    public  GmailItem[] items;

    public GmailArrayAdapter(GmailItem[] gmailItems) {

        items = gmailItems;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {

        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GmailItemViewHolder viewHolder;
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.gamilitems, parent, false);
            viewHolder = new GmailItemViewHolder(convertView);
            convertView.setTag(convertView);
        }else {
            viewHolder = (GmailItemViewHolder) convertView.getTag();
        }
        GmailItem item = (GmailItem) getItem(position);

        viewHolder.dateAndTime1.setText(item.dateAndTime);
        viewHolder.mainHedding1.setText(item.mainHadding);
        Picasso.get().load(item.posterUrl).into(viewHolder.gmailPoster);
        return convertView;

    }
}


