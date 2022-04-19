package com.example.sakha2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Teory, Slovary, Exersise;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Teory = findViewById(R.id.teory);
        Slovary = findViewById(R.id.slovary);
        Exersise = findViewById(R.id.exercise);


        View.OnClickListener goToTheory = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeoryActivity.class);
                startActivity(intent);
            }
        };
        Teory.setOnClickListener(goToTheory);

    }
}