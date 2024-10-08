package com.example.findmydoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Splash screen timer (1000 milliseconds = 1 second)
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set your splash screen layout

        // Delay for SPLASH_TIME_OUT milliseconds before transitioning to the MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start MainActivity after delay
                Intent i = new Intent(MainActivity.this, Onboarding_1.class);
                startActivity(i);
                // Close the SplashActivity so the user can't go back to it
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}