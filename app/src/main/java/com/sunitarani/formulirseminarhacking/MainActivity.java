package com.sunitarani.formulirseminarhacking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edNama;
    EditText edNohp;
    EditText edAlamat;
    Button btnDaftar;
    TextView tvHasil;
    Spinner spinnerPilihan;
    String[] pilihanDaftar = {"MOBILE", "WEB", "DESKTOP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.ed_nama);
        edNohp = findViewById(R.id.ed_nohp);
        edAlamat = findViewById(R.id.ed_alamat);
        btnDaftar = findViewById(R.id.btn_daftar);
        tvHasil = findViewById(R.id.tv_hasil);
        spinnerPilihan = findViewById(R.id.spinner_pilihan);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinnerPilihan.getSelectedItem().toString().equals(pilihanDaftar[0])) {
                    String hasil = "SYARAT : MEMBAWA SMARTPHONE";
                    tvHasil.setText(hasil.toString());
                } else if (spinnerPilihan.getSelectedItem().toString().equals(pilihanDaftar[1])) {
                    String hasil = "SYARAT : MEMBAWA LAPTOP DAN XAMPP";
                    tvHasil.setText(hasil.toString());
                } else if (spinnerPilihan.getSelectedItem().toString().equals(pilihanDaftar[2])) {
                    String hasil = "SYARAT : MEMBAWA LAPTOP PLUS ADA NETBEAN";
                    tvHasil.setText(hasil.toString());
                }
            }
        });

        //data
        //adapter
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, pilihanDaftar);
        spinnerPilihan.setAdapter(adapter);
    }
}
