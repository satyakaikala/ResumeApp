package com.prassatyan.resume.feature.resumemain.ui.activity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

import com.prassatyan.resume.feature.resumemain.R;
import com.prassatyan.resume.feature.resumemain.ui.github.fragment.GithubFragment;
import com.prassatyan.resume.feature.resumemain.ui.linkedin.LinkedinFragment;
import com.prassatyan.resume.feature.resumemain.ui.resume.ResumeFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_placeholder, new ResumeFragment()).commit();


        // TODO implement data binding once fragment switching works
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == com.prassatyan.resume.R.id.menu_item_resume) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_placeholder, new ResumeFragment()).commit();
            } else if (menuItem.getItemId() == com.prassatyan.resume.R.id.menu_item_github) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_placeholder, new GithubFragment()).commit();
            } else if (menuItem.getItemId() == com.prassatyan.resume.R.id.menu_item_linkedin) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_placeholder, new LinkedinFragment()).commit();
            }
            return true;
        });
    }
}
