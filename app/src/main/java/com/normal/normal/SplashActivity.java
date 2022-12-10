package com.normal.normal;

import static com.gitub.normal.myadscls.MySplashActivity.All_Data;

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