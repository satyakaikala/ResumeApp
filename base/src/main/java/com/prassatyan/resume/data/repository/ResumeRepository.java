package com.prassatyan.resume.data.repository;

import com.prassatyan.resume.data.remote.ResumeDataStore;

public class ResumeRepository {

    private final ResumeDataStore resumeDataStore;
    private static ResumeRepository INSTANCE;

    public ResumeRepository(ResumeDataStore resumeDataStore) {
        this.resumeDataStore = resumeDataStore;
    }

    public static ResumeRepository getRepository(ResumeDataStore dataStore) {
        if (INSTANCE == null) {
            synchronized (ResumeRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ResumeRepository(dataStore);
                }
            }
        }
        return INSTANCE;
    }

    public static void removeRepository() {
        INSTANCE = null;
    }

    public void getGitHubReposList(String user) {
        resumeDataStore.getGithubReposList(user);
    }
}
