package com.prassatyan.resume.di;

import com.prassatyan.resume.ResumeApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {OwnerModule.class, RepoModule.class})
public interface GithubComponent {
    void inject(ResumeApplication fragment);
}