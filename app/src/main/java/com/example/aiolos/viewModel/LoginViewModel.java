package com.example.aiolos.viewModel;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;

import androidx.lifecycle.ViewModel;

import com.example.aiolos.Hello;
import com.example.aiolos.LoginResultCallback;
import com.example.aiolos.MainActivity;
import com.example.aiolos.model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallback loginResultCallback;
    private Context context;

    public LoginViewModel(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
        this.user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LoginResultCallback getLoginResultCallback() {
        return loginResultCallback;
    }

    public void setLoginResultCallback(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
    }

    public TextWatcher getEmail(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher getPassword(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    public void onLoginClick(){
        if (user.isValidEmail()){
            //user.getEmail();
            loginResultCallback.onSuccess("Login Success", user.getEmail());

        }
        else {
            loginResultCallback.onFailure("Login Failed");
        }
    }
}
