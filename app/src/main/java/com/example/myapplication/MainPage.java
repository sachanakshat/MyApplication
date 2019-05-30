package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.support.v4.app.Fragment;


public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);

        loadFragment(new FragHome());

//        Fragment fragment = null;
//        FragmentManager fm = getSupportFragmentManager();
//        final FragmentTransaction ft = fm.beginTransaction();

        BottomNavigationView navigation2 = (BottomNavigationView) findViewById(R.id.navigationxml);
        navigation2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.camera_icon:
                        Toast.makeText(MainPage.this, "The next best feature coming", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent("android.media.action.IMAGE_CAPTURE"));
                        break;
                    case R.id.messages_icon:
                        Toast.makeText(MainPage.this, "Check back later!", Toast.LENGTH_SHORT).show();
                        fragment = new FragMessages();
                        break;
                    case R.id.navigation_home:
                        Toast.makeText(MainPage.this, "You are FragHome!", Toast.LENGTH_SHORT).show();
                        fragment = new FragHome();
//                        ft.replace(R.id.frag_container, new FragHome());
//                        ft.commit();
                        break;
                    case R.id.navigation_notifications:
                        Toast.makeText(MainPage.this, "No new notifications", Toast.LENGTH_SHORT).show();
                        fragment = new FragNotifs();
                        break;
                    case R.id.navigation_account:
                        Toast.makeText(MainPage.this, "Under development", Toast.LENGTH_SHORT).show();
                        fragment = new FragAccount();
                        break;

                }
                return loadFragment(fragment);
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frag_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
