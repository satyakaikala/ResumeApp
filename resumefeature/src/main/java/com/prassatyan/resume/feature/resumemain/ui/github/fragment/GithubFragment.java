package com.prassatyan.resume.feature.resumemain.ui.github.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prassatyan.resume.feature.resumemain.R;
import com.prassatyan.resume.feature.resumemain.ui.github.viewmodel.GitHubViewModel;
import com.prassatyan.resume.ui.ResumeBaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class GithubFragment extends ResumeBaseFragment {

    private static final String TAG = GithubFragment.class.getSimpleName();

    private GitHubViewModel gitHubViewModel;

    public GithubFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_github, container, false);
    }

}
