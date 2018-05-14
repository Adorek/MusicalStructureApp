package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a songs list
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Brandenburg Gate", "Mettalica"));
        songs.add(new Song("The View", "Metallica"));
        songs.add(new Song("Mistress Dread", "Metallica"));
        songs.add(new Song("Iced Honey", "Metallica"));
        songs.add(new Song("Cheat On Me", "Metallica"));
        songs.add(new Song("Frustration", "Metallica"));

        final SongAdapter adapter = new SongAdapter (this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String artistName = adapter.getItem(position).getArtistName();
                String songName = adapter.getItem(position).getSongName();

                Intent intent = new Intent(MainActivity.this, SongDetail.class);

                intent.putExtra("song", songName);
                intent.putExtra("artist", artistName);

                startActivity(intent);
                finish();
            }

        });
    }
}