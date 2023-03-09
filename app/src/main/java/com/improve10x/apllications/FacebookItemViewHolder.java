package com.improve10x.apllications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FacebookItemViewHolder {
    public TextView titleOne;
    public TextView titleTwo;
    public ImageView posterIv;

    public FacebookItemViewHolder (View convertView){
        titleOne = convertView.findViewById(R.id.title1_txt);
        titleTwo = convertView.findViewById(R.id.title2_txt);
        posterIv = convertView.findViewById(R.id.fbUrl_iv);
    }
}
