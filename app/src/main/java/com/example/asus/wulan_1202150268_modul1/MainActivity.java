package com.example.asus.wulan_1202150268_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText mNamaMenu, mBanyakPorsi;
        Button mButtonEatbus, mButtonAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNamaMenu = findViewById(R.id.menu);
        mBanyakPorsi = findViewById(R.id.porsi);
        mButtonEatbus = findViewById(R.id.button1);
        mButtonAbnormal = findViewById(R.id.button2);

        mButtonEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kemudian = new Intent(MainActivity.this, Main2Activity.class);
                kemudian.putExtra("namatempat", "EATBUS");
                kemudian.putExtra("namamenu", mNamaMenu.getText().toString());
                kemudian.putExtra("jumlahporsi", mBanyakPorsi.getText().toString());
                kemudian.putExtra("totalharga", "50000");
                startActivity(kemudian);
            }
        });

        mButtonAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kemudian = new Intent(MainActivity.this,Main2Activity.class);
                kemudian.putExtra("namatempat", "ABNORMAL");
                kemudian.putExtra("namamenu", mNamaMenu.getText().toString());
                kemudian.putExtra("jumlahporsi", mBanyakPorsi.getText().toString());
                kemudian.putExtra("totalharga", "30000");
                startActivity(kemudian);
            }
        });
    }
}
