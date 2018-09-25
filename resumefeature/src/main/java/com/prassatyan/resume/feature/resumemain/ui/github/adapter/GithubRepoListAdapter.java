package com.prassatyan.resume.feature.resumemain.ui.github.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prassatyan.resume.feature.resumemain.R;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;


public class GithubRepoListAdapter extends RecyclerView.Adapter<GithubRepoListAdapter.GitHubViewHolder> {

    private static final String TAG = GithubRepoListAdapter.class.getSimpleName();
    private RepoListener repoListener;

    public GithubRepoListAdapter(RepoListener repoListener) {
        this.repoListener = repoListener;
    }

    @Override
    public GitHubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_list_item, parent, false);
        return new GitHubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GitHubViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class GitHubViewHolder extends RecyclerView.ViewHolder {
        private AppCompatTextView repoName;
        private AppCompatTextView repoDesc;
        private AppCompatTextView more;

        public GitHubViewHolder(View rowItem) {
            super(rowItem);
            repoName = rowItem.findViewById(R.id.repoName);
            repoDesc = rowItem.findViewById(R.id.repoDesc);
            more = rowItem.findViewById(R.id.more);
        }
    }

    public void setReposList() {

        notifyDataSetChanged();
    }

    /**
     * Method to remove Remove
     */
    public void removeRepo() {

        notifyDataSetChanged();
    }

    /**
     * Method to add new Repo
     */
    public void addRepo() {

    }

    /**
     * Method to clear repos
     */
    public void clearRepos() {

        notifyDataSetChanged();
    }

    /**
     * Interface used to notify when repo is selected
     */
    public interface RepoListener {

        /**
         * Interface method to notify on repo clicked
         */
        void onRepoClicked();
    }
}
