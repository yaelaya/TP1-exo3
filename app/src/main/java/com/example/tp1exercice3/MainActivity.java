package com.example.tp1exercice3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private RadioButton radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder selectedContent = new StringBuilder();

                if (checkBox1.isChecked()) {
                    selectedContent.append(checkBox1.getText().toString()).append("\n");
                }
                if (checkBox2.isChecked()) {
                    selectedContent.append(checkBox2.getText().toString()).append("\n");
                }
                if (checkBox3.isChecked()) {
                    selectedContent.append(checkBox3.getText().toString()).append("\n");
                }
                if (checkBox4.isChecked()) {
                    selectedContent.append(checkBox4.getText().toString()).append("\n");
                }

                if (radioButton1.isChecked()) {
                    selectedContent.append(radioButton1.getText().toString()).append("\n");
                } else if (radioButton2.isChecked()) {
                    selectedContent.append(radioButton2.getText().toString()).append("\n");
                }

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("selectedContent", selectedContent.toString());
                startActivity(intent);
            }
        });
    }
}
