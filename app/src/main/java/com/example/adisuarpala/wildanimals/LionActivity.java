package com.example.adisuarpala.wildanimals;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class LionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lion);

        TextView textView = (TextView) findViewById(R.id.textLion);
        textView.setMovementMethod(new ScrollingMovementMethod());

        WebView web = (WebView) findViewById(R.id.webLion);
        web.setBackgroundColor(Color.TRANSPARENT);
        web.loadUrl("file:///android_res/drawable/lion.gif");
        web.requestFocus();
        web.clearCache(false);

        Button one = (Button)this.findViewById(R.id.btnLion);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.lion);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }


}
