package com.theleafapps.pro;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play_button, pause_button, volup_button, voldown_button,stop_button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play_button = (Button) findViewById(R.id.play_button);
        pause_button = (Button) findViewById(R.id.pause_button);
        volup_button = (Button) findViewById(R.id.volume_up_button);
        voldown_button = (Button) findViewById(R.id.volume_down_button);
        stop_button = (Button) findViewById(R.id.stop_button);

        mediaPlayer = MediaPlayer.create(this,R.raw.music);


        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pause_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        volup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        voldown_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.pause();
            }
        });
    }
}
