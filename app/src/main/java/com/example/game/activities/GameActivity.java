package com.example.game.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.game.R;

public class GameActivity extends AppCompatActivity {

    final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        setContentView(R.layout.menu);
        Log.e("Destroy", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Restart", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Pause", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(flags);
        final View decorView = getWindow().getDecorView();
        decorView
                .setOnSystemUiVisibilityChangeListener(visibility -> {
                    if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                        decorView.setSystemUiVisibility(flags);
                    }
                });
        Log.e("Resume", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Start", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Stop", "onStop");
    }
}
