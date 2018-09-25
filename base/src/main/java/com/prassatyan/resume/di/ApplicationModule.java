package com.prassatyan.resume.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.prassatyan.resume.data.local.DataStorage;
import com.prassatyan.resume.data.remote.ResumeDataStore;
import com.prassatyan.resume.data.repository.ResumeRepository;

import javax.inject.Singleton;

import androidx.annotation.NonNull;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @NonNull
    @Singleton
    public SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @NonNull
    @Singleton
    public DataStorage provideDataStorage(SharedPreferences sharedPreferences) {
        return new DataStorage(sharedPreferences);
    }

    @Provides
    @NonNull
    @Singleton
    public ResumeDataStore provideResumeDataStore() {
        return new ResumeDataStore();
    }

    @Provides
    @NonNull
    @Singleton
    public ResumeRepository provideResumeRepository(ResumeDataStore resumeDataStore) {
        return new ResumeRepository(resumeDataStore);
    }
}
