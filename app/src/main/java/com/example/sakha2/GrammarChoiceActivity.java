package com.example.sakha2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GrammarChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_choice);

        TextView Zagolovok ;
        Button Back2, Alfabet;

        Zagolovok = findViewById(R.id.zagolovok);
        Alfabet = findViewById(R.id.alfabet);
        Back2 = findViewById(R.id.back_button4);


        View.OnClickListener goToGrammar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GrammarChoiceActivity.this, TeoryActivity.class);
                startActivity(intent);
            }
        };
        Back2.setOnClickListener(goToGrammar);
    }
}