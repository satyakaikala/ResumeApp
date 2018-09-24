package com.prassatyan.resume.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * This is the Base Activity. All base activities will extend this.
 *
 * @author Satya
 */
public abstract class ResumeBaseActivity extends AppCompatActivity {

    private static final String TAG = ResumeBaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
