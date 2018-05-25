package com.janrone.app.linnk.java.login;

import android.content.Intent;

import com.janrone.app.linnk.java.BasePresenter;
import com.janrone.app.linnk.java.BaseView;

public interface LoginContract {

    interface View extends BaseView<Presenter> {

        void showEmpty();

        void showMessage(String msg);

        void startActivity();
    }

    interface Presenter extends BasePresenter {

        boolean checkData(String name, String pwd);

        void doLogin(String name, String pwd);
    }

}
