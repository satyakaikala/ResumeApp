package com.prassatyan.resume.data.remote;

import android.arch.lifecycle.MutableLiveData;

import com.prassatyan.resume.data.model.github.Repo;
import com.prassatyan.resume.network.github.GitHubApi;
import com.prassatyan.resume.network.github.GitHubApiImpl;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResumeDataStore {
    private static final String TAG = ResumeDataStore.class.getSimpleName();

    private static ResumeDataStore INSTANCE = null;

    private GitHubApi gitHubApi;
    private final MutableLiveData<List<Repo>> gitHubReposList;

    public static ResumeDataStore getDataStore() {
        if (INSTANCE == null) {
            synchronized (ResumeDataStore.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ResumeDataStore();
                }
            }
        }
        return INSTANCE;
    }

    public ResumeDataStore() {
        gitHubApi = new GitHubApiImpl();
        gitHubReposList = new MutableLiveData<>();
    }

    public static void removeInstance() {
        INSTANCE = null;
    }

    public void getGithubReposList(String user) {
        Call<List<Repo>> reposListCall = gitHubApi.reposList(user);
        reposListCall.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                if (response != null) {
                    gitHubReposList.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                gitHubReposList.postValue(null);
            }
        });
    }
}
