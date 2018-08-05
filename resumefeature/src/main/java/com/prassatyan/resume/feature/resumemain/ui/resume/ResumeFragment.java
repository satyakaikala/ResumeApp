package com.prassatyan.resume.feature.resumemain.ui.resume;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prassatyan.resume.feature.resumemain.R;



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
        return inflater.inflate(R.layout.fragment_resume, container, false);
    }

}
