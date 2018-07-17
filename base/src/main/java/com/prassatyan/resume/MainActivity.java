package com.prassatyan.resume;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO implement data binding once fragment switching works
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                /*FragmentManager fm = getSupportFragmentManager();
                for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
                    fm.popBackStack();
                }*/
                if(menuItem.getItemId() == R.id.menu_item_resume) {
                    //fm.beginTransaction().add(new GithubFragment(), null).commit();
                    Toast.makeText(MainActivity.this, "Clicked on resume", Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.menu_item_github) {
                    Toast.makeText(MainActivity.this, "Clicked on github", Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.menu_item_linkedin) {
                    Toast.makeText(MainActivity.this, "Clicked on linkedin", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
}
