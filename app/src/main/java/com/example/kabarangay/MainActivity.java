package com.example.kabarangay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);

        getStarted = findViewById(R.id.get_started);

        getStarted.setOnClickListener(this);

        overridePendingTransition(R.anim.enter_anim, R.anim.exit_anim);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.get_started) {
            startActivity(new Intent(this, SignUpActivity.class));
        }
    }
}