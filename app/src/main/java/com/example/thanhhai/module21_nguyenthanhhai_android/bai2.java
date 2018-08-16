package com.example.thanhhai.module21_nguyenthanhhai_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bai2 extends AppCompatActivity {

    private Button btnToCel;
    private Button btnToFah;
    private Button btnClear;
    private EditText txtCel;
    private EditText txtFah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        btnToCel=(Button)findViewById(R.id.buttonToCel);
        btnToFah=(Button)findViewById(R.id.buttonToFah);
        btnClear=(Button)findViewById(R.id.buttonClear);

        btnToCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCel=(EditText)findViewById(R.id.editTextCel);
                txtFah=(EditText)findViewById(R.id.editTextFah);

                double fah=Double.parseDouble(txtFah.getText()+"");
                double toCel=(fah-32)*5/9;
                txtCel.setText(toCel+"");
            }
        });
        btnToFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCel=(EditText)findViewById(R.id.editTextCel);
                txtFah=(EditText)findViewById(R.id.editTextFah);

                double cel=Double.parseDouble(txtCel.getText()+"");
                double toFah=cel*9/5+32;
                txtFah.setText(toFah+"");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCel=(EditText)findViewById(R.id.editTextCel);
                txtFah=(EditText)findViewById(R.id.editTextFah);
                txtCel.setText("");
                txtFah.setText("");
            }
        });
    }
}
