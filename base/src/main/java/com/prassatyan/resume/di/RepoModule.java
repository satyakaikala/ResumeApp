package com.prassatyan.resume.di;

import com.prassatyan.resume.data.model.github.Repo;

import dagger.Module;
import dagger.Provides;

@Module
public class RepoModule {

    @Provides
    public Repo provideRepo() {
        return Repo.create(1, "MyRepo", "MyRepo My Repo", "www.example.com", "This is my repo", true, "28 Jan", "30 Feb");
    }
}
