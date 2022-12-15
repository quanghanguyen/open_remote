package com.uit.finalproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.uit.finalproject.MainActivity;
import com.uit.finalproject.R;
import com.uit.finalproject.databinding.ActivityLoginBinding;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        login();
    }

    private void login() {
        binding.signUp.setOnClickListener(view -> {
            String userName = binding.userName.getText().toString();
            String password = binding.password.getText().toString();

            if (Objects.equals(userName, "user1") && Objects.equals(password, "Abc@@123")) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();
            }
        });
    }
}