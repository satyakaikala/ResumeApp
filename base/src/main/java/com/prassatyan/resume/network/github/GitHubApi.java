package com.prassatyan.resume.network.github;

import com.prassatyan.resume.data.model.github.Owner;
import com.prassatyan.resume.data.model.github.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubApi {

    /**
     * API to get the list of repos for given github user
     *
     * @param user - Github user name
     * @return
     */
    @GET("users/{user}/repos")
    Call<List<Repo>> reposList(@Path("user") String user);

    /**
     * API to fetch Github user
     *
     * @param userName - Github user name
     * @return
     */
    @GET("users/{username}")
    Call<Owner> getUser(@Path("username") String userName);
}
