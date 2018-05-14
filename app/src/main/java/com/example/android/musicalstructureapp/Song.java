package com.example.android.musicalstructureapp;


/*{@link Song} represents a song cureently playing.*/


public class Song {

    /** Song name */
    private String mSongName;

    /*Artist name*/
    private String mArtistName;


    /*Create a new Song object.

    @param songName is the name of the song

    @param artistName is the name of the artist*/

    public Song(String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }

    /*Get the song name*/
    public String getSongName() {
        return mSongName;
    }

    /*Get the artist name*/
    public String getArtistName() {
        return mArtistName;
    }
}