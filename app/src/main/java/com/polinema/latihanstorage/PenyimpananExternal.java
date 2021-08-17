package com.polinema.latihanstorage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PenyimpananExternal extends AppCompatActivity {
    private Button btnStore, btnGetall;
    private EditText etname;
    private DatabaseHelper databaseHelper;
    private TextView tvnames;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyimpanan_external);
//        panggil databse nya
        databaseHelper = new DatabaseHelper(this);
        tvnames = findViewById(R.id.tvnames);

        btnStore = findViewById(R.id.btnstore);
        btnGetall = findViewById(R.id.btnget);
        etname = findViewById(R.id.etname);

//        aksi
        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                DatabaseHelper dbHelper = new DatabaseHelper();
                databaseHelper.addStudentDetail(etname.getText().toString());
                etname.setText("");
                Toast.makeText(PenyimpananExternal.this, "berhasil", Toast.LENGTH_SHORT).show();
            }
        });

//        aksi
        btnGetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList = databaseHelper.getAllStudentsList();
                tvnames.setText("");
                for (int i = 0; i < arrayList.size(); i++) {
                    tvnames.setText(tvnames.getText().toString() + "," + arrayList.get(i));
                }
            }
        });
    }
}