package com.prassatyan.resume.feature.resumemain;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ResumeFragment extends Fragment {
    public ResumeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Toast.makeText(getContext(), "Clicked on resume", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_resume, container, false);
    }

}
