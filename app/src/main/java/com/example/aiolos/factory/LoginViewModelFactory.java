package com.example.aiolos.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.aiolos.LoginResultCallback;
import com.example.aiolos.viewModel.LoginViewModel;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private LoginResultCallback loginResultCallback;

    public LoginViewModelFactory(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
//        return super.create(modelClass);
        return (T)new LoginViewModel(loginResultCallback);
    }
}
