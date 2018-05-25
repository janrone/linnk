package com.janrone.app.linnk.kotlin.login

import com.janrone.app.linnk.kotlin.BasePresenter
import com.janrone.app.linnk.kotlin.BaseView

interface LoginContrack {

    interface View : BaseView<Presenter>{
        fun checkData()
    }


    interface Presenter : BasePresenter{
        fun doLogin(name : String , password: String)
    }

}