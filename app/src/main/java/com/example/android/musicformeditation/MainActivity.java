package com.example.android.musicformeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // random song button functionality
        findViewById(R.id.button_random_song).setOnClickListener(v -> {
            Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
            playIntent.putExtra("EXTRA_SONG_INDEX", Song.getRandomSongIndex());
            startActivity(playIntent);
        });

        // exit button functionality
        findViewById(R.id.button_exit).setOnClickListener(v -> System.exit(0));
    }
}