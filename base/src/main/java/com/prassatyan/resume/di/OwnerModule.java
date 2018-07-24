package com.prassatyan.resume.di;


import com.prassatyan.resume.data.model.github.Owner;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class OwnerModule {
    @Singleton
    @Provides
    public Owner provideOwner() {
        return Owner.create("Prasan", "prasan.pani@prasan.com", "Dallas", "www.example.com", "www.example.com", "true");
    }
}
