package com.improve10x.apllications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CallLogAdapter extends BaseAdapter {
    public CallItems[] items;
    public CallLogAdapter (CallItems[] callItems){

        items = callItems;
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
        CallLogViewHolder viewHolder ;
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.calllogitems, parent, false);
            viewHolder = new CallLogViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (CallLogViewHolder) convertView.getTag();
        }
        CallItems item = (CallItems) getItem(position);
        viewHolder.number1.setText(item.number);
       viewHolder.country1.setText(item.countryAndTime);

        Picasso.get().load(item.posterUrl).into(viewHolder.poster2);
        return convertView;
    }
}
