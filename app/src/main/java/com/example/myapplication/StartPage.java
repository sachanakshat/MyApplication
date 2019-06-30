package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StartPage extends AppCompatActivity{

    final String TAG = "LogIn";
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(this, MainPage.class));
            finish();
        }
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
        Intent main_page = new Intent(this, SignUp.class);
        startActivity(main_page);
    }

    public void login(View view) {
        Log.d(TAG, "Inside login function StartPage");
        Intent mein = new Intent(this, LogIn.class);
        startActivity(mein);
    }

    public void frpass(View view) {
        Intent forgotpass = new Intent(this, ResetPassword.class);
        startActivity(forgotpass);
    }
}
