package com.normal.normal;

import static com.gitub.normal.myadscls.MyAppManage.ADMOB_B;
import static com.gitub.normal.myadscls.MyAppManage.ADMOB_N0;
import static com.gitub.normal.myadscls.MyAppManage.FACEBOOK_N;
import static com.gitub.normal.myadscls.MyAppManage.FACEBOOK_NB;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gitub.normal.myadscls.MyAppManage;

public class MainActivity extends AppCompatActivity {
    Activity activity = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAppManage.getInstance(this).onlyCustBannerCallAD(this);
        MyAppManage.getInstance(this).onlyCustNativeCallAD(this);
        MyAppManage.getInstance(this).onlyCustInterstitialCallAD(this);
        MyAppManage.getInstance(this).showNativeBanner((ViewGroup) findViewById(com.gitub.normal.R.id.banner_container), ADMOB_B[0], FACEBOOK_NB[0]);
        MyAppManage.getInstance(this).showNative((ViewGroup) findViewById(com.gitub.normal.R.id.native_container), ADMOB_N0, FACEBOOK_N[0]);

        findViewById(R.id.txtxt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAppManage.getInstance( activity).showInterstitialAd(activity, new MyAppManage.MyCallback() {
                    public void callbackCall() {
                        Toast.makeText(activity, "here", Toast.LENGTH_SHORT).show();
                    }
                }, "", MyAppManage.app_mainClickCntSwAd);
            }
        });
    }

    @Override
    public void onBackPressed() {
        MyAppManage.getInstance(activity).showInterstitialAd(activity, new MyAppManage.MyCallback() {
            public void callbackCall() {
                MyAppManage.getInstance(activity).Show_Exite_Dialog(activity, getPackageName());
            }
        }, "", MyAppManage.app_innerClickCntSwAd);
    }
}