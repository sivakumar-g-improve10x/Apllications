package com.improve10x.apllications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MessengerActivity extends AppCompatActivity {
    ListView messageLv;
    public MessengerItems[] messengerItems;
    public MessangerArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        initViews();
        createMessangerData();
        setAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        messageLv.setAdapter(adapter);
    }

    private void setAdapter() {
        adapter = new MessangerArrayAdapter(messengerItems);
    }

    private void createMessangerData() {
        messengerItems = new MessengerItems[6];
        MessengerItems item1 = new MessengerItems();
        item1.profileDp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.userName = "Sam Scott";
        item1.message = "Hey how's it going";
        messengerItems[0] = item1;

        MessengerItems item2 = new MessengerItems();
        item2.profileDp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.userName = "Mai Tran";
        item2.message = "Mai sent a sticker";
        messengerItems[1] = item2;

        MessengerItems item3 = new MessengerItems();
        item3.profileDp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.userName = "Emmie Baros";
        item3.message = "Hi again :) ";
        messengerItems[2] = item3;

        MessengerItems item4 = new MessengerItems();
        item4.profileDp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.userName = "Jorge Torres";
        item4.message = "Can't Wait !";
        messengerItems[3] = item4;

        MessengerItems item5 = new MessengerItems();
        item5.profileDp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.userName = "Maria & Soumya";
        item5.message = "Nice";
        messengerItems[4] = item5;

        MessengerItems item6 = new MessengerItems();
        item6.profileDp = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.userName = "Surf Team";
        item6.message = "See you there 😎";
        messengerItems[5] = item6;
    }

    private void initViews() {
        messageLv = findViewById(R.id.messenger_lv);
    }
}