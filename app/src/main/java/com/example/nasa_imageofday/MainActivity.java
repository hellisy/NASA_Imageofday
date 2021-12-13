package com.example.nasa_imageofday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // When the begin button is clicked, transition to the toolbar.
        ((Button) findViewById(R.id.button_first)).setOnClickListener(clk -> {

            startActivity(new Intent(this, TestToolbar.class));
        });
    }
}