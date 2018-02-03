package com.example.asus.wulan_1202150268_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView mnamatempat;
    TextView mnamamenu;
    TextView mbanyakporsi;
    TextView mtotalharga;
    private  final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mnamatempat = findViewById(R.id.namatempat);
        mnamamenu = findViewById(R.id.namamakanan);
        mbanyakporsi = findViewById(R.id.totalporsi);
        mtotalharga = findViewById(R.id.totalharga);

        Intent x = getIntent();

        String namatempat = x.getStringExtra("namatempat");
        String namamenu = x.getStringExtra("namamenu");
        String jumlahporsi = x.getStringExtra("jumlahporsi");
        String totalharga = x.getStringExtra("totalharga");

        int totalHarga = Integer.valueOf(totalharga) * Integer.valueOf(jumlahporsi);

        mnamatempat.setText(namatempat);
        mnamamenu.setText(namamenu);
        mbanyakporsi.setText(jumlahporsi);
        mtotalharga.setText(String.valueOf(totalHarga));

    if (totalHarga <= uang){
        Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();

    } else {
        Toast.makeText(this,"Jangan disini makan malamnua, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
    }
    }
}
