package com.example.thanhhai.module21_nguyenthanhhai_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button callBai1;
    private Button callBai2;
    private Button callBai3;
    private Button callBai4;
    private Button callBai5;
    private Button callBai6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callBai1=(Button)findViewById(R.id.bai1);
        callBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, bai1.class);
                startActivity(intent);
            }
        });

        callBai2=(Button)findViewById(R.id.bai2);
        callBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, bai2.class);
                startActivity(intent);
            }
        });

        callBai3=(Button)findViewById(R.id.bai3);
        callBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, bai3.class);
                startActivity(intent);
            }
        });

        callBai4=(Button)findViewById(R.id.bai4);
        callBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, bai4.class);
                startActivity(intent);
            }
        });

        callBai5=(Button)findViewById(R.id.bai5);
        callBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, bai5.class);
                startActivity(intent);
            }
        });

        callBai6=(Button)findViewById(R.id.bai6);
        callBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, bai6.class);
                startActivity(intent);
            }
        });
    }
}
