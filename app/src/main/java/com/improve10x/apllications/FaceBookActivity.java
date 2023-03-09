package com.improve10x.apllications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FaceBookActivity extends AppCompatActivity {
    ListView facebookLv;
    public FacebookItems[] facebookItems;
    public FacebookArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_book);
        initViews();
        CreateFacebookData();
        setAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        facebookLv.setAdapter(adapter);
    }

    private void setAdapter() {
        adapter = new FacebookArrayAdapter(facebookItems);
    }

    private void CreateFacebookData() {
        adapter = new FacebookArrayAdapter(facebookItems);
        facebookItems = new FacebookItems[7];
        FacebookItems item1 = new FacebookItems();
        item1.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.title1 = "Angela Jami Favorito Huit reacted to your story.";
        item1.title2 = "1 hour ago";
        facebookItems[0] = item1;

        FacebookItems item2 = new FacebookItems();
        item2.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.title1 = "Kimwana Michael, Linh An and Channell Boxley asked to join I Love Still Life Painting!.";
        item2.title2 = "1 hour ago";
        facebookItems[1] = item2;

        FacebookItems item3 = new FacebookItems();
        item3.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.title1 = "Lloyd Cafe Cadena is live now:\n" +
                "\"LAPIT NA MAG END OF SEASONII\"";
        item3.title2 = "5 minutes ago";
        facebookItems[2] = item3;


        FacebookItems item4 = new FacebookItems();
        item4.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.title1 = "Sia Ellise Mejorada commented on a post in Hachi's Buy and Sell\n" +
                "Group.";
        item4.title2 = "1 hour ago";
        facebookItems[3] = item4;


        FacebookItems item5 = new FacebookItems();
        item5.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.title1 = "Mavreen Anne Romero and others lidded to their stories.";
        item5.title2 = "2 hours ago";
        facebookItems[4] = item5;

        FacebookItems item6 = new FacebookItems();
        item6.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.title1 = "Sosy Sophie, Rampage Traveland Tours and LetsircEcarg Nodner Nillillam listed in CAMSUR...";
        item6.title2 = "2 hours ago";
        facebookItems[5] = item6;


        FacebookItems item7 = new FacebookItems();
        item7.posterUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item7.title1 = "Bobby Alvarez and others added to their stories.";
        item7.title2 = "2 hours ago";
        facebookItems[6] = item7;

    }

    private void initViews() {
        facebookLv = findViewById(R.id.facebook_lv);
    }
}