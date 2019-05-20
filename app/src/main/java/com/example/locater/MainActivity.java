package com.example.locater;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /* @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
     }*/

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_main);
            setContentView(R.layout.gps_main);
            Button Locbtn ;
            Locbtn = findViewById(R.id.btnloc);
            Locbtn.setOnClickListener(this);


       }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnloc:
                    startActivity(new Intent(this, GPSService.class));
                    break;
            }

    }
}

