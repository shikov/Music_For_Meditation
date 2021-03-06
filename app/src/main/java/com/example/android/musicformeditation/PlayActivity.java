package com.example.android.musicformeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    private Song mSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        int songIndex = getIntent().getIntExtra("EXTRA_SONG_INDEX", 0);
        mSong = Song.getSongs().get(songIndex);

        ((TextView) findViewById(R.id.song_name)).setText(mSong.getName());
        ((TextView) findViewById(R.id.song_artist)).setText(mSong.getArtist());
        ((TextView) findViewById(R.id.song_duration)).setText(mSong.getFormattedDuration());
    }
}