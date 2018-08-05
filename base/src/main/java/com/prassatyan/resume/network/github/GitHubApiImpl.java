package com.prassatyan.resume.network.github;

import com.prassatyan.resume.data.model.github.Owner;
import com.prassatyan.resume.data.model.github.Repo;

import java.util.List;

import retrofit2.Call;

/**
 * Github service class
 */
public class GitHubApiImpl implements GitHubApi {

    /**
     * Method to retrieve list of repos from github
     *
     * @param user - User to get the list of repos
     * @return
     */
    @Override
    public Call<List<Repo>> reposList(String user) {
        return NetworkClient.getClient().create(GitHubApi.class).reposList(user);
    }

    /**
     * Method to get github user info
     *
     * @param userName - User name to retrieve
     * @return
     */
    @Override
    public Call<Owner> getUser(String userName) {
        return NetworkClient.getClient().create(GitHubApi.class).getUser(userName);
    }
}
