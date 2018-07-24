package com.prassatyan.resume.feature.resumemain;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO implement data binding once fragment switching works
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            FragmentManager fm = getSupportFragmentManager();
            for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
                fm.popBackStack();
            }
            if (menuItem.getItemId() == com.prassatyan.resume.R.id.menu_item_resume) {
                getSupportFragmentManager().beginTransaction().add(new ResumeFragment(), null).commit();
            } else if (menuItem.getItemId() == com.prassatyan.resume.R.id.menu_item_github) {
                getSupportFragmentManager().beginTransaction().add(new GithubFragment(), null).commit();
            } else if (menuItem.getItemId() == com.prassatyan.resume.R.id.menu_item_linkedin) {
                Toast.makeText(MainActivity.this, "Clicked on linkedin", Toast.LENGTH_SHORT).show();
            }
            return true;
        });
    }
}
