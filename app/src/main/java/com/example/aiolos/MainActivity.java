package com.example.aiolos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.aiolos.databinding.ActivityMainBinding;
import com.example.aiolos.factory.LoginViewModelFactory;
import com.example.aiolos.model.User;
import com.example.aiolos.viewModel.LoginViewModel;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity implements LoginResultCallback{

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new ViewModelProvider(this, new LoginViewModelFactory(this)).get(LoginViewModel.class));

    }

    @Override
    public void onSuccess(String message, String user) {
        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Hello.class);
        intent.putExtra("email", user);
        this.startActivity(intent);
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();
    }
}