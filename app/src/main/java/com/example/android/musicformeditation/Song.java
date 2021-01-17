package com.example.android.musicformeditation;

import android.annotation.SuppressLint;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Song {
    private final String mName;
    private final String mArtist;
    private final int mDuration;

    public Song(String name, String artist, int duration) {
        mName = name;
        mArtist = artist;
        mDuration = duration; // seconds
    }

    public String getName() {
        return mName;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getDuration() {
        return mDuration;
    }

    @SuppressLint("DefaultLocale")
    public String getFormattedDuration() {
        int minutes = mDuration / 60;
        int seconds = mDuration % 60;
        return minutes + ":" + String.format("%02d", seconds);
    }

    // static variables & functions
    private static Random randomGenerator = new Random();
    private static final ArrayList<Song> songs = new ArrayList<Song>() {
        {
            add(new Song("Temple of Silence", "Deuter", 561));
            add(new Song("Sound of Invisible Waters", "Deuter", 234));
            add(new Song("Baba Hanuman", "Krishna Das", 452));
            add(new Song("Mere Gurudev", "Krishna Das", 338));
            add(new Song("Looming", "Ephemeral Mists", 321));
            add(new Song("Sacred Geometries", "Ephemeral Mists", 308));
            add(new Song("Dreamcatcher", "Kamal", 604));
            add(new Song("Song of the Deep", "Kamal", 425));
        }
    };

    public static ArrayList<Song> getSongs() {
        return songs;
    }

    public static int getRandomSongIndex() {
        return randomGenerator.nextInt(songs.size());
    }
}
