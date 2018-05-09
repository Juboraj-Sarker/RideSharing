package com.juborajsarker.rideshareing;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){

            actionBar.hide();
        }
    }

    public void register(View view) {

        startActivity(new Intent(HomeActivity.this, RegisterActivity.class));
    }
}
