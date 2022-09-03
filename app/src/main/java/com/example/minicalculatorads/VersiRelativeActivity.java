package com.example.minicalculatorads;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VersiRelativeActivity extends AppCompatActivity {

    Button buttonTambah, buttonKurang, buttonKali, buttonBagi;
    EditText angkaPertama, angkaKedua;
    TextView hasilCalc;
    double jawaban = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkaPertama = (EditText) findViewById(R.id.angka_1);
        angkaKedua =  (EditText) findViewById(R.id.angka_2);
        buttonTambah = (Button) findViewById(R.id.tambah);
        buttonKurang = (Button) findViewById(R.id.minus);
        buttonTambah = (Button) findViewById(R.id.tambah);
        buttonKali = (Button) findViewById(R.id.kali);
        buttonBagi = (Button) findViewById(R.id.bagi);
        hasilCalc = (TextView) findViewById(R.id.hasil);

        // Pertambahan
        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaPertama.getText().length()>0 && angkaKedua.getText().length()>0 ) {
                    double a = Double.parseDouble(angkaPertama.getText().toString());
                    double b = Double.parseDouble(angkaKedua.getText().toString());
                    jawaban = a + b;
                    hasilCalc.setText(Double.toString(jawaban));
                }
                else {
                    Toast toast = Toast.makeText(VersiRelativeActivity.this,"Masukkan Angka",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        // Pengurangan
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaPertama.getText().length()>0 && angkaKedua.getText().length()>0 ) {
                    double a = Double.parseDouble(angkaPertama.getText().toString());
                    double b = Double.parseDouble(angkaKedua.getText().toString());
                    jawaban = a - b;
                    hasilCalc.setText(Double.toString(jawaban));
                }
                else {
                    Toast toast = Toast.makeText(VersiRelativeActivity.this,"Masukkan Angka",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        // Perkalian
        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaPertama.getText().length()>0 && angkaKedua.getText().length()>0 ) {
                    double a = Double.parseDouble(angkaPertama.getText().toString());
                    double b = Double.parseDouble(angkaKedua.getText().toString());
                    jawaban = a * b;
                    hasilCalc.setText(Double.toString(jawaban));
                }
                else {
                    Toast toast = Toast.makeText(VersiRelativeActivity.this,"Masukkan Angka",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        // Pembagian
        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaPertama.getText().length()>0 && angkaKedua.getText().length()>0 ) {
                    double a = Double.parseDouble(angkaPertama.getText().toString());
                    double b = Double.parseDouble(angkaKedua.getText().toString());
                    if (b != 0) {
                        jawaban = a / b;
                        hasilCalc.setText(Double.toString(jawaban));
                    } else {
                        Toast toast = Toast.makeText(VersiRelativeActivity.this,"Masukkan Angka yang Benar !",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
                else {
                    Toast toast = Toast.makeText(VersiRelativeActivity.this,"Masukkan Angka",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

    }
}
