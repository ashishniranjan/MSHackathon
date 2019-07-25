package com.example.rahul.mshack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        String notificationArray[] = {
          "Temporary Parking Restrictions at MLCP",
          "Temporary non-availability of elevators in Building 2",
          "Fire Evacuation Drill at SSKC"
        };

        ListView notificationList = findViewById(R.id.list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.single_list_item, notificationArray);
        notificationList.setAdapter(adapter);



        //"Periodic Maintenance of infrastructure at Cafes 1 & 3"
        //"Temporary Non-availability of Parking at Lake Area near Building 3"


    }
}
