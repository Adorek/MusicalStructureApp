package com.example.android.musicalstructureapp;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.util.ArrayList;

public class SongDetail extends AppCompatActivity {

    public ArrayList<Song> songs;
    public int position;
    private TextView artistName;
    private TextView titleName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);

        Button back = findViewById(R.id.back);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            //Get the name of a song
            String song = extras.getString("song");
            //Get the name of artist
            String artist = extras.getString("artist");
            //Populate TextView with song name
            TextView songName = (TextView) findViewById(R.id.song_name);
            songName.setText(song + " \u266A");
            //Populate TextView with artist name
            TextView artistName = (TextView) findViewById(R.id.artist_name);
            artistName.setText(artist);
        }

        // Code for back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongDetail.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}