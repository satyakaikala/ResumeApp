package com.prassatyan.resume.contract;

public interface MVPContract {

    interface IBaseView {
        void initView();
    }

    interface IBaseActivityPresenter<V extends IBaseView> {
        void onCreate(V view);

        void onStart();

        void onResume();

        void onPause();

        void onStop();

        void onDestroy();
    }

    interface IBaseModel {

    }

}
