package com.example.ghoomogyaan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opening);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
        startActivity(new Intent(opening.this, Login.class));
        finish();
           }
       },3000);

    }
}