package com.improve10x.apllications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentContainerView;

import com.squareup.picasso.Picasso;

public class FacebookArrayAdapter extends BaseAdapter {
public FacebookItems[] items;
public FacebookArrayAdapter (FacebookItems[] facebookItems){
    items = facebookItems;
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
        FacebookItemViewHolder viewHolder;
        if (convertView == null) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        convertView = inflater.inflate(R.layout.facebookitems, parent, false);
        viewHolder = new FacebookItemViewHolder(convertView);
        convertView.setTag(convertView);
    }else {
            viewHolder = (FacebookItemViewHolder) convertView.getTag();
        }
           FacebookItems item = (FacebookItems) getItem(position);

        viewHolder.titleOne.setText(item.title1);
        viewHolder.titleTwo.setText(item.title2);
        Picasso.get().load(item.posterUrl).into(viewHolder.posterIv);
        return convertView;
    }
}

