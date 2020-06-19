package com.example.a10in1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class Image_magnifier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_magnifier);

        // retrieve references to the Views defined in the activity_main.xml
        final ImageView imageView_large = (ImageView) findViewById(R.id.imageView_large);
        SeekBar tuner = (SeekBar) findViewById(R.id.seekBar_tuner);

        // load the image file in the ImageView
        // alternate solution: see activity_mail.xml:  android:src="@drawable/drawing"
        imageView_large.setImageResource(R.drawable.dr);

        // attach a listener to the seekBar to tract the value selected by the user
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            // last known position of the cursor
            int lastProgress;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // update last known position of the cursor
                lastProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // the user released the cursor, apply a new colored filter to the image
                imageView_large.setColorFilter(Color.argb(255, 0, lastProgress, 255-lastProgress));
            }
        });
    }
}
