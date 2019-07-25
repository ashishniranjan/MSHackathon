package com.example.rahul.mshack;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class SupportTicketActivity extends AppCompatActivity {

    private Button uploadBtn, chooseBtn;
    private EditText title, description;

    private ImageView imgView;

    private Uri mImageUri;
    private static final int PICK_IMAGE_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support_ticket);

        uploadBtn = findViewById(R.id.upload_btn);
        chooseBtn = findViewById(R.id.choose_btn);
        imgView = findViewById(R.id.image);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);



        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String titleText = title.getText().toString().trim();
                String descriptionText = description.getText().toString().trim();

                if (mImageUri != null && !TextUtils.isEmpty(titleText) && !TextUtils.isEmpty(descriptionText)) {

                    String msg  = " Support Ticket with Id "+  (10000 +new Random(System.currentTimeMillis()).nextInt(20000))+" created.";

                    NotificationHelper notificationHelper = new NotificationHelper(getApplicationContext(), msg);
                    NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
                    notificationHelper.getManager().notify(1, nb.build());

                    Toast.makeText(SupportTicketActivity.this, "Complaint submitted successfully", Toast.LENGTH_SHORT).show();

                    try {
                        Thread.sleep(1000);
                    }catch(Exception ex)
                    { }

                    startActivity(new Intent(SupportTicketActivity.this, DashboardActivity.class));

                } else {
                    String msg="";
                    if (mImageUri == null)
                        msg += " No Image Selected";
                    if(TextUtils.isEmpty(titleText))
                        msg += " Enter title";
                    if(TextUtils.isEmpty(descriptionText))
                        msg += " Enter Description";

                    Toast.makeText(SupportTicketActivity.this, msg, Toast.LENGTH_SHORT).show();
                }
            }
        });
        chooseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileChooser();
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null) {
            mImageUri = data.getData();
            Picasso.get().load(mImageUri).into(imgView);
        }
    }
    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }
}
