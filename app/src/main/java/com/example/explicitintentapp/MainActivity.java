package com.example.explicitintentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Intents: Facilities communication b/w different components of App, as well as b/w different Application

        //Intents type: 1. Explicit Intent 2. Implicit Intent

        //XML Button
        Button nextActivityBtn = findViewById(R.id.nextActivityBtn);

        //clickListener on XML Button
        nextActivityBtn.setOnClickListener(v->{
            //calling method
            goToSecondActivity();
        });


    }

    //creating method for Explicit Intent
    public void goToSecondActivity(){
        //Intent class, and other parameter (Current Activity Context,Target Activity Context)
        Intent intent = new Intent(this,SecondActivity.class);
        //calling startActivity() method
        startActivity(intent);
    }
}