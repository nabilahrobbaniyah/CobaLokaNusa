package com.example.cobalokanusa.activities;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cobalokanusa.R;
import com.example.cobalokanusa.database.AppDatabase;
import com.example.cobalokanusa.database.entities.User;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RegisterActivity extends AppCompatActivity {

    EditText etUsername, etEmail, etPassword;
    Button btnSave, btnBack;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSave = findViewById(R.id.btnSave);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());

        btnSave.setOnClickListener(v -> {

            String username = etUsername.getText().toString();
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Harap isi semua kolom", Toast.LENGTH_SHORT).show();
                return;
            }

            User user = new User();
            user.username = username;
            user.email = email;
            user.passwordHash = password;
            user.role = "USER";
            user.createdAt = "2026-01-01";

            executorService.execute(() -> {
                AppDatabase.getInstance(this)
                        .userDao()
                        .insert(user);

                runOnUiThread(() -> {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show();
                    finish();
                });
            });
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executorService.shutdown();
    }
}