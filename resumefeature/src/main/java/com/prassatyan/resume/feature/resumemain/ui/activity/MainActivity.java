package com.prassatyan.resume.feature.resumemain.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import com.prassatyan.resume.feature.resumemain.R;
import com.prassatyan.resume.feature.resumemain.ui.github.fragment.GithubFragment;
import com.prassatyan.resume.feature.resumemain.ui.linkedin.LinkedinFragment;
import com.prassatyan.resume.feature.resumemain.ui.resume.ResumeFragment;
import com.prassatyan.resume.ui.ResumeBaseActivity;


public class MainActivity extends ResumeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_placeholder, new ResumeFragment()).commit();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_license) {

            startActivity(new Intent(this, OssLicensesMenuActivity.class));

        }
        return false;
    }
}
