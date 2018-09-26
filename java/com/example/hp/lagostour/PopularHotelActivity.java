package com.example.hp.lagostour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PopularHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PopularHotelFragment())
                .commit();

    }
}
