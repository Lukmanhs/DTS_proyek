package com.example.pencatatanpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class TambahCatatanPulsaActivity extends AppCompatActivity {
    EditText edtNama, edtNominal;
    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    public static ArrayList<String> dataPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_catatan_pulsa);
        edtNama = findViewById(R.id.edt_nama);
        edtNominal = findViewById(R.id.edt_nominal);
    }

    public void clickSubmit(View view) {
        String ket = edtNama.getText().toString();
        String nominal = edtNominal.getText().toString();
        if (TextUtils.isEmpty(ket) && TextUtils.isEmpty(nominal)) {
            Toast.makeText(view.getContext(), "Nama,Nominal dan keterangan tidak boleh kosong!",
                    Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(ket)) {
            Toast.makeText(view.getContext(), "Nama tidak boleh kosong!",
                    Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(nominal)) {
            Toast.makeText(view.getContext(), "Nominal tidak boleh kosong!",
                    Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(TambahCatatanPulsaActivity.this, BerandaActivity.class);
            intent.putExtra("DataNama", ket);
            intent.putExtra("DataNominal", nominal);
            startActivity(intent);
        }
    }
}