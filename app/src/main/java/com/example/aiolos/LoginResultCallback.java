package com.example.aiolos;

public interface LoginResultCallback {
    public void onSuccess(String message, String user);
    public void onFailure(String message);
}
