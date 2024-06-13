package com.example.exp4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        // Get the Intent that started this activity and extract the string
        String text = getIntent().getStringExtra("EXTRA_TEXT");

        // Set the text to the TextView
        textView.setText(text);
    }
}
