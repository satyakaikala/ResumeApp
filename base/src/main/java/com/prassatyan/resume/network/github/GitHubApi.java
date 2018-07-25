package com.prassatyan.resume.network.github;

import com.prassatyan.resume.data.model.github.Owner;
import com.prassatyan.resume.data.model.github.Repo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubApi {

    @GET("users/{user}/repos")
    Single<List<Repo>> listRepos(@Path("user") String user);

    @GET("users/{username}")
    Single<Owner> getUser(@Path("username") String userName);
}
