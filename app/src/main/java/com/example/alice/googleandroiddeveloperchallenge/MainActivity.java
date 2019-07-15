package com.example.alice.googleandroiddeveloperchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public void startAboutALCActivity(View view)
    {
        startActivity(new Intent(this, AboutALC.class));
    }

    public void startMyProfile(View view)
    {
        startActivity(new Intent(this,MyProfile.class ));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ALC 4 Phase 1");

    }
}


