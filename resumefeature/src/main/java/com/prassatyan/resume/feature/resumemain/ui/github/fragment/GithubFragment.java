package com.prassatyan.resume.feature.resumemain.ui.github.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prassatyan.resume.ResumeApplication;
import com.prassatyan.resume.feature.resumemain.R;
import com.prassatyan.resume.feature.resumemain.ui.github.viewmodel.GitHubViewModel;
import com.prassatyan.resume.ui.ResumeBaseFragment;


/**
 * A simple {@link ResumeBaseFragment} subclass.
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
        ((ResumeApplication) getActivity().getApplication()).getComponent().inject((ResumeApplication) getActivity().getApplication());
        Log.d("YOYOYOY", ((ResumeApplication) getActivity().getApplication()).getOwner().toString());
        Log.d("YOYOYOY", ((ResumeApplication) getActivity().getApplication()).getRepo().toString());
        return inflater.inflate(R.layout.fragment_github, container, false);
    }

}