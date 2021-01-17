package com.example.android.musicformeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // exit button functionality
        findViewById(R.id.button_exit).setOnClickListener(v -> System.exit(0));
    }
}