package com.prassatyan.resume.feature.resumemain.ui.github.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class GithubRepoListAdapter extends RecyclerView.Adapter<GithubRepoListAdapter.GitHubViewHolder> {

    @Override
    public GitHubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(GitHubViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GitHubViewHolder extends RecyclerView.ViewHolder {
        public GitHubViewHolder(View itemView) {
            super(itemView);
        }
    }
}
