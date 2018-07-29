package com.prassatyan.resume.presenter;

import com.prassatyan.resume.contract.MVPContract;

public abstract class BasePresenter implements MVPContract.IBaseActivityPresenter {

    protected MVPContract.IBaseView mView = null;
    protected MVPContract.IBaseModel mModel = null;

    @Override
    public void onCreate(MVPContract.IBaseView view) {
        mView = view;
    }

    abstract protected void setmModel(MVPContract.IBaseModel model);

}
