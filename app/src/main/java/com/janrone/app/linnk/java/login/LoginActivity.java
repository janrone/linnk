package com.janrone.app.linnk.java.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.janrone.app.linnk.R;
import com.janrone.app.linnk.java.util.ActivityUtils;

public class LoginActivity extends AppCompatActivity {

    private LoginPresenter mLoginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);

        LoginFragment loginFragment = (LoginFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fl_content);

        if (loginFragment == null) {
            loginFragment = LoginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    loginFragment, R.id.fl_content);
        }

        mLoginPresenter = new LoginPresenter(loginFragment, "","");
    }
}
