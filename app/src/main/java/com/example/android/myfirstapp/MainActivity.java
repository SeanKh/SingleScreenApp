package com.example.android.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }
    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.imageButton1);

        imageButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "Welcome! Here is how to find us", Toast.LENGTH_SHORT).show();

            }

        });

    }

}
