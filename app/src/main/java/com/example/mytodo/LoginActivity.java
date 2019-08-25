package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Window;
import android.view.WindowManager;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(LoginActivity.this, "Welcome to My ToDo application!", Toast.LENGTH_SHORT);
        toast.show();
    }

}

