package com.example.hp.lagostour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FestivalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FestivalsFragment())
                .commit();

    }
}
