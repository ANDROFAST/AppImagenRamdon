package com.androidmorefast.moden.appimagenrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final Random rgenerador = new Random();

    private static final Integer[] imagenesID =
            {R.drawable.img2, R.drawable.img1, R.drawable.img3,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);

        View nextButton = findViewById(R.id.btnNextImg);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
            }
        });
    }
}
