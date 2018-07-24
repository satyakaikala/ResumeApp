package com.prassatyan.resume.feature.resumemain.di;

import com.prassatyan.resume.di.OwnerModule;
import com.prassatyan.resume.di.RepoModule;
import com.prassatyan.resume.feature.resumemain.GithubFragment;

import dagger.Component;

@Component(modules={OwnerModule.class, RepoModule.class})
public interface GithubComponet {

    void inject(GithubFragment fragment);

}
