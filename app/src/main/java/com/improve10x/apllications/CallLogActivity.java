package com.improve10x.apllications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CallLogActivity extends AppCompatActivity {
ListView callLogLv;
public CallItems[] callLogItems;
public CallLogAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_log);
        initViews();
        createCllLogDate();
        connectAdapter();
        setupAdapter();
    }

    private void setupAdapter() {
        callLogLv.setAdapter(adapter);
    }

    private void connectAdapter() {
        adapter = new CallLogAdapter(callLogItems);

    }

    private void createCllLogDate() {
        callLogItems = new CallItems[5];
        CallItems item1 = new CallItems();
        item1.posterUrl = "https://static.thenounproject.com/png/100859-200.png";
        item1.number = "9865444587";
        item1.countryAndTime = "india , 46 min , ago";
        callLogItems[0] = item1;

        CallItems item2 = new CallItems();
        item2.posterUrl = "https://static.thenounproject.com/png/100859-200.png";
        item2.number = "WiFi";
        item2.countryAndTime = "Mobile , 1 hr, ago";
        callLogItems[1] = item2;

        CallItems item3 = new CallItems();
        item3.posterUrl = "https://static.thenounproject.com/png/100859-200.png";
        item3.number = "76575544354";
        item3.countryAndTime = "india , 22 hr , ago";
        callLogItems[2] = item3;

        CallItems item4 = new CallItems();
        item4.posterUrl = "https://static.thenounproject.com/png/100859-200.png";
        item4.number = "8547337586";
        item4.countryAndTime = "india , 2 days ago";
        callLogItems[3] = item4;

        CallItems item5 = new CallItems();
        item5.posterUrl = "https://static.thenounproject.com/png/100859-200.png";
        item5.number = "8764573643";
        item5.countryAndTime = "new Delhi , 2 days ago";
        callLogItems[4] = item5;
    }

    private void initViews() {

        callLogLv = findViewById(R.id.call_log_lv);
    }
}