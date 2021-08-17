package com.polinema.latihanstorage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    Button penyimpananInternal;
    Button peyimpananExternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penyimpananInternal = findViewById(R.id.internalStorage);
        penyimpananInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PenyimpananInternal.class);
                startActivity(intent);
            }
        });
    }
}
