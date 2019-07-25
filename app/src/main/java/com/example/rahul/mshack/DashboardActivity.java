package com.example.rahul.mshack;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class DashboardActivity extends AppCompatActivity {
    private Button mapView;
    private Button courseView;
    private Button chatBot;
    private Button supportTicket;
    private boolean backAlreadyPressed = false;
    public static String notificationCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        android.support.v7.app.ActionBar menu = getSupportActionBar();
        menu.setLogo(R.mipmap.ic_launcher);
        menu.setDisplayUseLogoEnabled(true);
        menu.setDisplayShowHomeEnabled(true);


        mapView = findViewById(R.id.mapView);
        courseView = findViewById(R.id.courseView);
        chatBot = findViewById(R.id.chatBot);
        supportTicket = findViewById(R.id.supportView);

        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MapActivity.class));
            }
        });
        courseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, CourseActivity.class));
            }
        });
        chatBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ChatBotActivity.class));
            }
        });
        supportTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SupportTicketActivity.class));
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (backAlreadyPressed) {
            // close the application
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
            super.onBackPressed();
            return;
        }
        // first back press should set the variable to true & show a Toast to press again to close application
        this.backAlreadyPressed = true;
        Toast.makeText(this, getResources().getString(R.string.toast_confirm_exit_message), Toast.LENGTH_SHORT).show();
        // set the variable to false if it takes more than 2sec for another back press
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                backAlreadyPressed = false;
            }
        }, 2000);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.notify:
                    startActivity(new Intent(DashboardActivity.this, NotificationActivity.class));
                break;
        }
        return true;
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if(notificationCount == null
                )
            notificationCount = "3";
        setCount(this, notificationCount, menu);
        return true;
    }
    public void setCount(Context context, String count, Menu menu) {
        MenuItem menuItem = menu.findItem(R.id.notify);
        LayerDrawable icon = (LayerDrawable) menuItem.getIcon();
        CountDrawable badge;
        // Reuse drawable if possible
        Drawable reuse = icon.findDrawableByLayerId(R.id.ic_group_count);
        if (reuse != null && reuse instanceof CountDrawable) {
            badge = (CountDrawable) reuse;
        } else {
            badge = new CountDrawable(context);
        }
        badge.setCount(count);
        icon.mutate();
        icon.setDrawableByLayerId(R.id.ic_group_count, badge);
    }

}