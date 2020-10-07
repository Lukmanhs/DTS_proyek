package com.example.pencatatanpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LihatCatatanPulsaActivity extends AppCompatActivity {
    private ListView lsvPengeluaran;
    private ArrayAdapter<String> adapter_lihat_pengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_catatan_pulsa);

        // Panggil List View
        this.lsvPengeluaran = this.findViewById(R.id.lsv_pengeluaran);

        // Siapkan adapter
        this.adapter_lihat_pengeluaran = new ArrayAdapter<String>(
                this,
                R.layout.layout_list_view_sederhana,
                BerandaActivity.dataCatatan
        );

        this.lsvPengeluaran.setAdapter(this.adapter_lihat_pengeluaran);
    }
}