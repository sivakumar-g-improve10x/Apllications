package com.improve10x.apllications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CallLogViewHolder {
public TextView number1;
public TextView country1;
public ImageView poster2;

public CallLogViewHolder (View convertView){
    number1 = convertView.findViewById(R.id.number_txt);
    country1 = convertView.findViewById(R.id.country_txt);
    poster2 = convertView.findViewById(R.id.image_iv);
}

}