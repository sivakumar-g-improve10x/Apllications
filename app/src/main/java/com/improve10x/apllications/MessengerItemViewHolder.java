package com.improve10x.apllications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MessengerItemViewHolder {
    public TextView userName1;
    public TextView message1;
    public ImageView profileDp;

    public MessengerItemViewHolder (View convertView){
        userName1 = convertView.findViewById(R.id.username_txt);
        message1 = convertView.findViewById(R.id.message_txt);
        profileDp = convertView.findViewById(R.id.poster_dp_iv);
    }
}
