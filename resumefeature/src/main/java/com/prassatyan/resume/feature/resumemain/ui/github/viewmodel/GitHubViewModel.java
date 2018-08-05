package com.prassatyan.resume.feature.resumemain.ui.github.viewmodel;

import android.app.Application;

import com.prassatyan.resume.data.repository.ResumeRepository;
import com.prassatyan.resume.ui.ResumeViewModel;


public class GitHubViewModel extends ResumeViewModel {

    private ResumeRepository resumeRepository;

    public GitHubViewModel(ResumeRepository resumeRepository, Application application) {
        super(application);
        this.resumeRepository = resumeRepository;
    }

    public void getGitHubReposList(String user) {
        resumeRepository.getGitHubReposList(user);
    }
}
