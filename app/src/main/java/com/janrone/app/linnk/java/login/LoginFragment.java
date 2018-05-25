package com.janrone.app.linnk.java.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.janrone.app.linnk.R;
import com.janrone.app.linnk.java.links.LinksActivity;


public class LoginFragment extends Fragment implements LoginContract.View {

    private LoginContract.Presenter mPresenter;

    private EditText mName, mPassword;
    private Button mBtnLogin;

    public static LoginFragment newInstance(){
        return  new LoginFragment();
    }
    public LoginFragment(){

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
        mName = root.findViewById(R.id.et_name);
        mPassword = root.findViewById(R.id.et_password);
        mBtnLogin = root.findViewById(R.id.btn_login);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnLogin.setOnClickListener(v -> mPresenter.doLogin(mName.getText().toString().trim(),
                mPassword.getText().toString()));
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.mPresenter = (presenter);
    }

    @Override
    public void showEmpty() {
        Snackbar.make(mName, getString(R.string.empty_message), Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void showMessage(String  msg) {
        Snackbar.make(mName, msg, Snackbar.LENGTH_LONG).show();
    }


    public void startActivity(){
        Intent intent = new Intent();
        intent.setClass(getActivity(), LinksActivity.class);
        //intent.putExtra("cookei", "");
        startActivity(intent);
        getActivity().finish();
    }
}
