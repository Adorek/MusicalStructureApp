package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongDetail extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);

        Button back = findViewById(R.id.back);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            //Get the name of a song
            String songName = extras.getString("song");
            //Get the name of artist
            String artistName = extras.getString("artist");
            //Populate TextView with song name
            TextView songNameText = (TextView) findViewById(R.id.song_name);
            songNameText.setText(songName + " \u266A");
            //Populate TextView with artist name
            TextView artistNameText = (TextView) findViewById(R.id.artist_name);
            artistNameText.setText(artistName);
        }

        // Code for back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongDetail.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}