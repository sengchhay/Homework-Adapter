package com.example.hw_adapter_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Message_infoActivity extends AppCompatActivity {

    ImageView imageView;
    TextView tvmessage;
    String message;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_info);

        imageView = findViewById(R.id.imageInfo);
        tvmessage = findViewById(R.id.tvInfo);

        message= getIntent().getStringExtra("Message");
        image= getIntent().getIntExtra("image",0);

        imageView.setImageResource(image);
        tvmessage.setText(message);




    }
}
