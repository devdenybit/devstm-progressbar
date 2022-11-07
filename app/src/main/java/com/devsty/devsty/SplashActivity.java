package com.devsty.devsty;

import static com.unisob.vclibs.mads.SplashActivity.All_Data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        try {
            All_Data(this, new Intent(this, Class.forName(getPackageName()  + ".MainActivity")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}