package com.example.a10in1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class button_toast extends AppCompatActivity {
    Button buttonBlue, buttonPink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_toast);

        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);
        buttonPink = (Button) findViewById(R.id.button_pinkPanther);
    }
    public void toDo(View v) {
        if (v.equals(buttonBlue))
            // buttonBlue was clicked
            // turn the button invisible
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            // buttonPink was clicked
            // display a pop-up message for a short duration
            Toast.makeText(getApplicationContext(),
                    "Button is clicked Here's is your Toast",
                    Toast.LENGTH_SHORT).show();
    }
}