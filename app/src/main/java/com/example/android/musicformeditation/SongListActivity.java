package com.example.android.musicformeditation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SongListActivity extends AppCompatActivity implements SongAdapter.ListItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        RecyclerView songListView = findViewById(R.id.song_list);
        songListView.setLayoutManager(new LinearLayoutManager(this));
        songListView.setHasFixedSize(true);
        songListView.setAdapter(new SongAdapter(this));
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        Intent playIntent = new Intent(this, PlayActivity.class);
        playIntent.putExtra("EXTRA_SONG_INDEX", clickedItemIndex);
        startActivity(playIntent);
    }
}