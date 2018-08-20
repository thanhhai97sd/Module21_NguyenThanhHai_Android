package com.example.thanhhai.module21_nguyenthanhhai_android;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class bai5 extends AppCompatActivity {

    Button btnTT, btnTiep, btnTK;
    EditText txtTenKH, txtSL;
    TextView txtTT,txtTongKH, txtTongKHVip, txtTongDT;
    double tongtien=0;

    double doanhthu=0;
    int tskh=0;
    int tskhv=0;

    public void onCheckboxClicked(View view){
        boolean checked=((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkVIP:
                if(checked) {
                    txtTT=findViewById(R.id.txtThanhTien);
                    double tt=Double.parseDouble(txtTT.getText()+"");
                    tt=tt*0.9;
                    txtTT.setText(tt+"");
                    tskhv++;
                }
                else
                {
                    txtTT=findViewById(R.id.txtThanhTien);
                    double tt=Double.parseDouble(txtTT.getText()+"");
                    tt=(tt/9)*10;
                    txtTT.setText(tt+"");
                    //tskhv--;
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        btnTT=findViewById(R.id.btnTinhTien);
        btnTiep=findViewById(R.id.btnTiep);
        btnTK=findViewById(R.id.btnTK);

        btnTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTenKH=findViewById(R.id.txtTenKH);
                txtSL=findViewById(R.id.txtSLS);
                txtTT=findViewById(R.id.txtThanhTien);


                int sl=Integer.parseInt(txtSL.getText()+"");
                tongtien+=sl*20000;
                txtTT.setText(tongtien+"");

                doanhthu+=tongtien;
                tongtien=0;
            }
        });

        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tskh++;

                txtTenKH=findViewById(R.id.txtTenKH);
                txtSL=findViewById(R.id.txtSLS);
                txtTenKH.setText("");
                txtSL.setText("");
            }
        });

        btnTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTongKH=findViewById(R.id.txtTSKH);
                txtTongKHVip=findViewById(R.id.txtTSVip);
                txtTongDT=findViewById(R.id.txtTDT);

                txtTongKH.setText(tskh+"");
                txtTongKHVip.setText(tskhv+"");
                txtTongDT.setText(doanhthu+"");
            }
        });
    }
}
