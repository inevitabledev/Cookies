package com.example.android.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        textView = (TextView) findViewById(R.id.status_text_view);
    }
    public void eatCookie(View view) {
        imageView.setImageResource(R.drawable.after_cookie);
        textView.setText("I'm so full");
    }
}
