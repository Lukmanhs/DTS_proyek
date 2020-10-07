package com.example.pencatatanpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class BerandaActivity extends AppCompatActivity {

    public static ArrayList<String> dataCatatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        if(dataCatatan == null){
            // Inisialisasi
            dataCatatan = new ArrayList<>();
        }else{
            if(TextUtils.isEmpty(getIntent().getStringExtra("DataNama"))|| TextUtils.isEmpty(getIntent().getStringExtra("DataNominal"))){

            }else{
                dataCatatan.add(getIntent().getStringExtra("DataNama")+" - "+getIntent().getStringExtra("DataNominal"));
            }
        }
        if(TextUtils.isEmpty(getIntent().getStringExtra("DataNama"))){
            Toast.makeText(getBaseContext(), "Data Kosong", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getBaseContext(), "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnTambahPengeluaran(View view){
        Intent i = new Intent(BerandaActivity.this, TambahCatatanPulsaActivity.class);
        this.startActivity(i);
    }

    public void btnLihatPengeluaran(View view){
        Intent i = new Intent(BerandaActivity.this, LihatCatatanPulsaActivity.class);
        this.startActivity(i);
    }
}