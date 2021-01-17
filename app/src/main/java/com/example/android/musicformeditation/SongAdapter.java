package com.example.android.musicformeditation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
        ((TextView) listItemView.findViewById(R.id.song_name)).setText(currentSong.getName());
        ((TextView) listItemView.findViewById(R.id.song_duration))
                .setText(currentSong.getFormattedDuration());
        ((TextView) listItemView.findViewById(R.id.song_artist)).setText(currentSong.getArtist());

        return listItemView;
    }
}
