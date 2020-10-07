package com.example.pencatatanpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static final int DURASI_SPLASH_MS = 3700;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, BerandaActivity.class);
                MainActivity.this.startActivity(i);
                MainActivity.this.finish();
            }
        }, DURASI_SPLASH_MS);
    }
}