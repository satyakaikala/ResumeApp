package com.prassatyan.resume;

import android.app.Application;

import com.prassatyan.resume.data.local.DataStorage;
import com.prassatyan.resume.data.model.github.Owner;
import com.prassatyan.resume.data.model.github.Repo;
import com.prassatyan.resume.di.DaggerGithubComponent;
import com.prassatyan.resume.di.GithubComponent;
import com.prassatyan.resume.di.OwnerModule;
import com.prassatyan.resume.di.RepoModule;

import javax.inject.Inject;

/**
 * Application class
 *
 * @author Satya
 */
public class ResumeApplication extends Application {

    GithubComponent component;
    @Inject
    Owner owner;
    @Inject
    Repo repo;


    @Override
    public void onCreate() {
        super.onCreate();
        DataStorage.initialize(this);
        component = DaggerGithubComponent.builder().ownerModule(new OwnerModule()).repoModule(new RepoModule()).build();
    }

    public GithubComponent getComponent() {
        return component;
    }

    public Owner getOwner() {
        return owner;
    }

    public Repo getRepo() {
        return repo;
    }
}
