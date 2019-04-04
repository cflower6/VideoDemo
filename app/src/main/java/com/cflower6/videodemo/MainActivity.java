package com.cflower6.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("www2.gogoanime.io/karakuri-circus-episode-24");

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();


    }
}
