package com.example.aiolos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.aiolos.model.User;

public class Hello extends AppCompatActivity {

    TextView hello;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        String user = getIntent().getStringExtra("email");
        hello = findViewById(R.id.user);

//        String user1 = user.getEmail();
        hello.setText(user);

    }
}