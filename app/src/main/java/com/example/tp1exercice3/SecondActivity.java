package com.example.tp1exercice3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String selectedContent = getIntent().getStringExtra("selectedContent");

        TextView textView = findViewById(R.id.textViewSelectedContent);
        textView.setText(selectedContent);
    }
}
