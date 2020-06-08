package com.example.idrug;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.core.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(android.view.View view) {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void cadastro(android.view.View view) {

        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
};