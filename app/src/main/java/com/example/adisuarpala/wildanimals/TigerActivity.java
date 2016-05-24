package com.example.adisuarpala.wildanimals;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class TigerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiger);

        TextView textView = (TextView) findViewById(R.id.textTiger);
        textView.setMovementMethod(new ScrollingMovementMethod());

        WebView web = (WebView) findViewById(R.id.webTiger);
        web.setBackgroundColor(Color.TRANSPARENT);
        web.loadUrl("file:///android_res/drawable/tiger.gif");
        web.requestFocus();
        web.clearCache(false);

        Button one = (Button)this.findViewById(R.id.btnTiger);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tiger);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }

}
