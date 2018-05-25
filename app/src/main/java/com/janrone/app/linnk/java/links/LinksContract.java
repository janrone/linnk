package com.janrone.app.linnk.java.links;

import com.janrone.app.linnk.java.BasePresenter;
import com.janrone.app.linnk.java.BaseView;

import java.util.List;

public interface LinksContract {

    interface View extends BaseView<Presenter>{

        void setUserInfo();
        void setTagList();
        void setLinksList();
    }

    interface Presenter extends BasePresenter{
        void getUserInfo();
         List getTagList();
         List getAllLinks();
    }

}
