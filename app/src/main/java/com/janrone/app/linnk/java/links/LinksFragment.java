package com.janrone.app.linnk.java.links;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.janrone.app.linnk.R;
import com.janrone.app.linnk.java.login.LoginFragment;

public class LinksFragment extends Fragment implements LinksContract.View{

    private LinksContract.Presenter mPresenter;

    public static LinksFragment newInstance(){
        return  new LinksFragment();
    }
    public LinksFragment(){

    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frag_login, container, false);
        //mName = root.findViewById(R.id.et_name);
        //mPassword = root.findViewById(R.id.et_password);
        //mBtnLogin = root.findViewById(R.id.btn_login);
        return root;
    }

    @Override
    public void setUserInfo() {

    }

    @Override
    public void setTagList() {

    }

    @Override
    public void setLinksList() {

    }

    @Override
    public void setPresenter(LinksContract.Presenter presenter) {
        this.mPresenter = presenter;
    }
}
