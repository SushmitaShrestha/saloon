package com.example.sushmita.saloon;


//Sushmita Shrestha - 2019445

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton imageButton1,imageButton2,imageButton3,imageButton4;
    Button btn1,btn2,btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //btn1 and img1 on click listener
        btn1 = findViewById(R.id.parlour1);
        imageButton1 = findViewById(R.id.imageButton1);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });


        //btn2 and img2 on click listener
        btn2 = findViewById(R.id.parlour2);
        imageButton2 = findViewById(R.id.imageButton2);

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)

            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });

        //btn3 and img3 on click listener

        btn3 = (Button) findViewById(R.id.parlour3);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)

            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });

        //btn4 and img4 on click listener
        btn4 = (Button) findViewById(R.id.parlour4);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);

        btn4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(HomeActivity.this,SalonParlour1.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is true.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
       //Handel action bar and control up/down btn
        int id = item.getItemId();

        //no inspection Simplifiable If-Statement

        if (id == R.id.action_settings) {
            Intent i  =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0892309620"));
            startActivity(i);
        }
        if(id == R.id.action_settings2)
        {
            Intent i =new Intent(HomeActivity.this,FeedbackActivity.class);
            startActivity(i);
        }
        if(id == R.id.action_settings3)
        {
            Intent i =new Intent(HomeActivity.this,RateUsActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {

        // navigation view handel b click
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            //  camera action
        } else if (id == R.id.nav_gallery)
        {
            Intent i = new Intent(HomeActivity.this,HistoryActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_slideshow)
        {

        } else if (id == R.id.nav_manage)
        {

        } else if (id == R.id.nav_share)
        {

            try {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                String sAux = "\nLet me recommend you this application\n\n";
                sAux = sAux + "https://play.google.com/store/apps/details?package/testing.id \n\n";
                i.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(i, "choose one"));
            } catch(Exception e) {
                //e.toString();
            }
        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}

