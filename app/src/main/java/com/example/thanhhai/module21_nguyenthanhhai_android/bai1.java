package com.example.thanhhai.module21_nguyenthanhhai_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bai1 extends AppCompatActivity {

    EditText soa;
    EditText sob;
    int a;
    int b;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        kq=(TextView)findViewById(R.id.textViewKQ);

        Button btncong=(Button)findViewById(R.id.buttonCong);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soa=(EditText)findViewById(R.id.editTextSOA);
                sob=(EditText)findViewById(R.id.editTextSOB);
                a= Integer.parseInt(soa.getText()+"");
                b= Integer.parseInt(sob.getText()+"");
                int cong=a+b;
                kq.setText(cong+"");
            }
        });

        Button btnHieu=(Button)findViewById(R.id.buttonHieu);
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soa=(EditText)findViewById(R.id.editTextSOA);
                sob=(EditText)findViewById(R.id.editTextSOB);
                a= Integer.parseInt(soa.getText()+"");
                b= Integer.parseInt(sob.getText()+"");
                int hieu=a-b;
                kq.setText(hieu+"");
            }
        });

        Button btnTich=(Button)findViewById(R.id.buttonTich);
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soa=(EditText)findViewById(R.id.editTextSOA);
                sob=(EditText)findViewById(R.id.editTextSOB);
                a= Integer.parseInt(soa.getText()+"");
                b= Integer.parseInt(sob.getText()+"");
                int tich=a*b;
                kq.setText(tich+"");
            }
        });

        Button btnThuong=(Button)findViewById(R.id.buttonThuong);
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soa=(EditText)findViewById(R.id.editTextSOA);
                sob=(EditText)findViewById(R.id.editTextSOB);
                a= Integer.parseInt(soa.getText()+"");
                b= Integer.parseInt(sob.getText()+"");
                float thuong=a/b;
                kq.setText(thuong+"");
            }
        });

        Button btnThoat=(Button)findViewById(R.id.buttonThoat);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
