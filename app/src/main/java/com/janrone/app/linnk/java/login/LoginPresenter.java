package com.janrone.app.linnk.java.login;


import android.annotation.SuppressLint;
import android.text.TextUtils;

import com.github.florent37.rxjsoup.RxJsoup;
import com.google.gson.Gson;
import com.janrone.app.linnk.java.data.modle.BaseResult;
import com.janrone.app.linnk.java.util.JsoupHelp;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View mLoginView;

    private String mName, mPassword;
    public LoginPresenter(LoginContract.View loginView, String name, String password){
        mName = name;
        mPassword = password;
        mLoginView = loginView;
        mLoginView.setPresenter(this);
    }

    @Override
    public boolean checkData(String name, String pwd) {
        if(TextUtils.isEmpty(name) || TextUtils.isEmpty(pwd)){
            return true;
        }else {
            return false;
        }
    }

    @SuppressLint("CheckResult")
    @Override
    public void doLogin(String name, String password) {
        if(checkData(name,password)){
            mLoginView.showEmpty();
        }else {
            RxJsoup.connect(
                    Jsoup.connect("https://linnk.net/a/webLogin")
                            //.header("Content-Type", "application/json; charset=UTF-8")
                            .ignoreContentType(true)
                            .data("userName", name)
                            .data("password", password)
                            .method(Connection.Method.POST)
            ).subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            response -> result((HttpConnection.Response) response)
                            //{//Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                              //  mLoginView.showMessage(response.body().toString());
                                //Log.e("Tag",response.toString());}
                    );
        }
    }


    public void result(HttpConnection.Response response) {
        if(response.statusCode() == 200){
            Gson gson = new Gson();
            BaseResult result = gson.fromJson(response.body().toString(), BaseResult.class);
            mLoginView.showMessage(result.getMessage());
            if (result.getCode() == 200){
                JsoupHelp.getInstance().setCookies(response.cookies());
                mLoginView.showMessage(result.getMessage());
                mLoginView.startActivity();
            }
        }else {
            mLoginView.showMessage("Login Error");
        }
    }

    @Override
    public void start() {

    }
}
