package com.example.lat2_akb2_10116068_adityamr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
Tanggal Pengerjaan  : 13-04-2019
NIM                 : 10116068
Nama                : Aditya Maulana Rajak
Kelas               : AKB-2
ChangeLog
``Main Activity
13-04-2019 12:00 PM - 02:00 PM
``Register
13-04-2019 04:00 PM - 06:00 PM
13-04-2019 07:30 PM - 23:30 PM
``Almost There
13-04-2019 23:30 PM - 23:45 PM
``Verify
13-04-2019 23:45 PM - 24:00 AM
``Home
13-05-2019 24:00 AM - 05:00 AM
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
    }
}
