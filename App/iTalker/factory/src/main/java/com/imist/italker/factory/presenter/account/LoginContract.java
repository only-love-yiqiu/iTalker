package com.imist.italker.factory.presenter.account;

import com.imist.italker.factory.presenter.BaseContract;

public interface LoginContract {
    interface View extends BaseContract.View<Presenter> {
        void loginSuccess();
    }

    interface Presenter extends BaseContract.Presenter {
        void login(String phone, String password);

    }

}
