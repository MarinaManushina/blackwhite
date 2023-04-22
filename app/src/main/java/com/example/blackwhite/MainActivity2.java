package com.example.blackwhite;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        text1.setText(bundle.getString("key1"));
        text2.setText(bundle.getString("key"));

    }
}