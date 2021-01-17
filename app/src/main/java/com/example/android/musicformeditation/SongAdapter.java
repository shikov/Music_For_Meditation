package com.example.android.musicformeditation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private final ListItemClickListener mItemOnClickListener;

    interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    public SongAdapter(ListItemClickListener itemOnClickListener) {
        mItemOnClickListener = itemOnClickListener;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SongViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song currentSong = Song.getSongs().get(position);
        holder.songNameView.setText(currentSong.getName());
        holder.songArtistView.setText(currentSong.getArtist());
        holder.songDurationView.setText(currentSong.getFormattedDuration());
    }

    @Override
    public int getItemCount() {
        return Song.getSongs().size();
    }

    class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView songNameView;
        TextView songArtistView;
        TextView songDurationView;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            songNameView = itemView.findViewById(R.id.song_name);
            songArtistView = itemView.findViewById(R.id.song_artist);
            songDurationView = itemView.findViewById(R.id.song_duration);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemOnClickListener.onListItemClick(getAdapterPosition());
        }
    }
}
