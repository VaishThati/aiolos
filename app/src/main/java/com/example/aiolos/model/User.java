package com.example.aiolos.model;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.regex.Pattern;

public class User extends BaseObservable {

    @NonNull
    private String email, password;

    public User(){

    }

    public User(@NonNull String email, @NonNull String password) {
        this.email = email;
        this.password = password;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public boolean isValidEmail(){
        if (this.email !=null && !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            return true;
        }
        return false;
    }

    public boolean isValidPass(){
        if (this.password!=null && this.password.length()>=6){
            return true;
        }
        return false;
    }

    public String getHelloMsg(){
        return "Hello" + this.getEmail();
    }
}
