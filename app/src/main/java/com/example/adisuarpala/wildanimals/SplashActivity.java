package com.example.adisuarpala.wildanimals;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class SplashActivity extends Activity {

    private boolean backBtnPress;
    private static final int SPLASH_DURATION = 7000; //7sec
    private Handler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        WebView web = (WebView) findViewById(R.id.webView);
        web.setBackgroundColor(Color.TRANSPARENT);
        web.loadUrl("file:///android_res/drawable/bar.gif");
        web.requestFocus();
        web.clearCache(false);

        /*VideoView videoView = (VideoView)findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse("android.resource://com.example.adisuarpla.wildanimals/" + R.drawable.bar));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();*/

        myHandler = new Handler();

        myHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                finish();
                if (!backBtnPress){
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    SplashActivity.this.startActivity(intent);
                }
            }
        }, SPLASH_DURATION);
    }

    @Override
    public void onBackPressed() {
        backBtnPress = true;
        super.onBackPressed();
    }
}
