package com.improve10x.apllications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GmailActivity extends AppCompatActivity {
ListView gmailLv;
public GmailItem [] gmailItems;
public GmailArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
        createGmailData();
        setAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
gmailLv.setAdapter(adapter);
    }

    private void setAdapter() {
adapter = new GmailArrayAdapter(gmailItems);
    }

    private void createGmailData() {
        gmailItems = new GmailItem[5];
        GmailItem item1 = new GmailItem();
        item1.name = "Lisa Paik";
        item1.mainHadding = "Volunteering at the Lakestone student art...";
        item1.posterUrl = "https://o.remove.bg/downloads/01178b62-d84f-4f29-9f5a-db380a4463b4/Artboard-34-removebg-preview.png";
        item1.dateAndTime = "3.43PM";
        gmailItems [0] = item1;

        GmailItem item2 = new GmailItem();
        item2.name = "Hi Julia! ";
        item2.mainHadding = "Thank you for your interest in volun...\n" +
                "Elena Casarosa";
        item2.posterUrl = "https://o.remove.bg/downloads/fe63dd61-4fed-4bd8-b464-8a6cf6d101b5/person-girl-outline-filled-removebg-preview.png";
        item2.dateAndTime = "11:24Am";
        gmailItems [1] = item2;

        GmailItem item3 = new GmailItem();
        item3.name = "Medium Daily Digest ";
        item3.mainHadding = "\"7 Drawings to make you feel better.\" publi... Medium Daily Digest Get Medium for iOS or...\n" +
                "Grace Ellington\n" +
                "Volunteer opportunity";
        item3.posterUrl = "https://cdn3.iconfinder.com/data/icons/person-16/64/person-214-128.png";
        item3.dateAndTime = "6:30PM";
        gmailItems [2] = item3;

        GmailItem item4 = new GmailItem();
        item4.name = "Grace Ellington ";
        item4.mainHadding = "Volunteer opportunity ";
        item4.posterUrl = "https://o.remove.bg/downloads/dc35bf5c-7224-499d-9b30-f4d125cbf5ab/images-removebg-preview.png";
        item4.dateAndTime = "Nov 19";
        gmailItems [3] = item4;

        GmailItem item5 = new GmailItem();
        item5.name = "Henri Rousseau ";
        item5.mainHadding = "Niagra falls pictures";
        item5.posterUrl = "https://o.remove.bg/downloads/6ff938ce-a4c7-46a4-b2ff-7dfc8e8c8708/images-removebg-preview.png";
        item5.dateAndTime = "Nov 19";
        gmailItems [4] = item5;
    }

    private void initViews() {
        gmailLv = findViewById(R.id.gmail_lv);
    }
}