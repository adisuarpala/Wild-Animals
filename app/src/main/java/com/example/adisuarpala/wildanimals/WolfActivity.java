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

public class WolfActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wolf);

        TextView textView = (TextView) findViewById(R.id.textWolf);
        textView.setMovementMethod(new ScrollingMovementMethod());

        WebView web = (WebView) findViewById(R.id.webWolf);
        web.setBackgroundColor(Color.TRANSPARENT);
        web.loadUrl("file:///android_res/drawable/wolf.gif");
        web.requestFocus();
        web.clearCache(false);

        Button one = (Button)this.findViewById(R.id.btnWolf);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.wolf);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
