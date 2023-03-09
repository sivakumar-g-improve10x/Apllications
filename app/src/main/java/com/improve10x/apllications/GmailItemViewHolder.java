package com.improve10x.apllications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GmailItemViewHolder {
    public TextView mainHedding1;
    public TextView dateAndTime1;
    public ImageView gmailPoster;

    public GmailItemViewHolder (View convertView){
        mainHedding1 = convertView.findViewById(R.id.gmail_name_txt);
        dateAndTime1 = convertView.findViewById(R.id.time_txt);
        gmailPoster = convertView.findViewById(R.id.gamil_poster_iv);
    }
}
