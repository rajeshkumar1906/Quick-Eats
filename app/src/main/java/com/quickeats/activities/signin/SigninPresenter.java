package com.quickeats.activities.signin;

import com.quickeats.shared.MvpPresenter;

public interface SigninPresenter extends MvpPresenter<SigninView> {

    void handleLoginRequest(String email, String password,Object validations,Object networkModule);
    void handleLaunchSignUpscreen();
    void handleLaunchForgetScreen();
}
