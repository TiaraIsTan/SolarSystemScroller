package com.example.owner.solarsystemscroller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void sendBack(View view) {
        // Do something in response to button click
        setContentView(R.layout.activity_main);
    }

    public void sendNeptune(View view) {
        // Do something in response to button click
        setContentView(R.layout.neptune_fragment);
    }

    public void sendUranus(View view) {
        // Do something in response to button click
        setContentView(R.layout.uranus_fragment);
    }

    public void sendSaturn(View view) {
        // Do something in response to button click
        setContentView(R.layout.saturn_fragment);
    }

    public void sendJupiter(View view) {
        // Do something in response to button click
        setContentView(R.layout.jupiter_fragment);
    }

    public void sendMars(View view) {
        // Do something in response to button click
        setContentView(R.layout.mars_fragment);
    }

    public void sendEarth(View view) {
        // Do something in response to button click
        setContentView(R.layout.earth_fragment);
    }

    public void sendVenus(View view) {
        // Do something in response to button click
        setContentView(R.layout.venus_fragment);
    }

    public void sendMercury(View view) {
        // Do something in response to button click
        setContentView(R.layout.mercury_fragment);
    }



}
