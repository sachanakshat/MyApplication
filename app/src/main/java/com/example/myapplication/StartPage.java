package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartPage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

//    @Override
//    public void onClick(View view)
//    {
//        startActivity(new Intent(this, MainPage.class));
//
//        switch (view.getId())
//        {
//            //handle multiple view click events
//        }
//    }

    public void signup(View view) {
        Intent main_page = new Intent(this, MainPage.class);
        startActivity(main_page);
    }
}
