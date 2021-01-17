package com.example.android.musicformeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        SongAdapter adapter = new SongAdapter(this, Song.getSongs());
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent playIntent = new Intent(this, PlayActivity.class);
            playIntent.putExtra("EXTRA_SONG_INDEX", position);
            startActivity(playIntent);
        });
    }
}