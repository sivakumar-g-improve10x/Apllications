package com.improve10x.apllications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MessangerArrayAdapter extends BaseAdapter {
    public MessengerItems[] items;
    public MessangerArrayAdapter(MessengerItems[] messengerItems){
        items = messengerItems;
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
        MessengerItemViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.messageitems, parent, false);
            viewHolder = new MessengerItemViewHolder(convertView);
            convertView.setTag(viewHolder);
    }else{
        viewHolder = (MessengerItemViewHolder) convertView.getTag();
        }
        MessengerItems item = (MessengerItems) getItem(position);
        viewHolder.userName1.setText(item.userName);
        viewHolder.message1.setText(item.message);
        Picasso.get().load(item.profileDp).into(viewHolder.profileDp);
        return convertView;
    }
}
