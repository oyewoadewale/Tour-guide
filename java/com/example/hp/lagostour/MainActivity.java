package com.example.hp.lagostour;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Add navigation drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // add on item selected listener to navigation drawer
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override

    // override to determine how to open and close drawer
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // set on navigation item selected to use each item in drawer to open
    // a new activity (when clicked)


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_festival) {
            //Open festival activity
            Intent festivalIntent = new Intent(MainActivity.this, FestivalsActivity.class);
            // Start the new activity
            startActivity(festivalIntent);

        } else if (id == R.id.nav_hotels) {
            //Open hotels activity
            Intent hotelsIntent = new Intent(MainActivity.this, PopularHotelActivity.class);
            // Start the new activity
            startActivity(hotelsIntent);

        } else if (id == R.id.nav_religious) {
            //Open religious activity
            Intent religiousIntent = new Intent(MainActivity.this, ReligiousPlaceActivity.class);
            // Start the new activity
            startActivity(religiousIntent);

        } else if (id == R.id.nav_tourist) {
            //Open tourist activity
            Intent touristIntent = new Intent(MainActivity.this, TouristAttractionActivity.class);
            // Start the new activity
            startActivity(touristIntent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
