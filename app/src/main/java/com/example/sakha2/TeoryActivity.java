package com.example.sakha2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TeoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teory);


        Button Osnov;
        Osnov = findViewById(R.id.osnov2);
        Button back = findViewById(R.id.back_button2);

        ImageButton Back;
        Back = findViewById(R.id.back_button);


        View.OnClickListener goToMain = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };
        back.setOnClickListener(goToMain);


        View.OnClickListener goToGramm = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeoryActivity.this, GrammarChoiceActivity.class);
                startActivity(intent);
            }
        };
        Osnov.setOnClickListener(goToGramm);
    }
}