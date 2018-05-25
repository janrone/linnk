package com.janrone.app.linnk.java.links;

import android.view.View;

import com.github.florent37.rxjsoup.RxJsoup;
import com.google.gson.Gson;
import com.janrone.app.linnk.java.BasePresenter;
import com.janrone.app.linnk.java.data.Api;
import com.janrone.app.linnk.java.data.modle.UserResult;
import com.janrone.app.linnk.java.util.JsoupHelp;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LinksPresenter implements LinksContract.Presenter{

    private LinksFragment mLinksFragment;
    public LinksPresenter(LinksFragment linksFragment){
        mLinksFragment = linksFragment;
        mLinksFragment.setPresenter(this);
    }

    @Override
    public void getUserInfo() {
        RxJsoup.connect(
                Jsoup.connect(Api.USERINFO)
                        .cookies(JsoupHelp.getInstance().getCookies())
                        //.header("Content-Type", "application/json; charset=UTF-8")
                        .ignoreContentType(true)
                        .method(Connection.Method.GET)
        ).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                       response ->  {
                           Gson gson = new Gson();
                           UserResult userResult = gson.fromJson(response.body(), UserResult.class);
                       }

                        //response -> result((HttpConnection.Response) response)
                        //{//Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                        //  mLoginView.showMessage(response.body().toString());
                        //Log.e("Tag",response.toString());}
                );
    }

    @Override
    public List getTagList() {
        RxJsoup.connect(
                Jsoup.connect(Api.TAGS)
                        .cookies(JsoupHelp.getInstance().getCookies())
                        //.header("Content-Type", "application/json; charset=UTF-8")
                        .ignoreContentType(true)
                        .method(Connection.Method.GET)
        ).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        //response -> result((HttpConnection.Response) response)
                        //{//Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                        //  mLoginView.showMessage(response.body().toString());
                        //Log.e("Tag",response.toString());}
                );
        return null;
    }

    @Override
    public List getAllLinks() {

        return null;
    }

    @Override
    public void start() {

    }
}
