package com.example.thanhhai.module21_nguyenthanhhai_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bai3 extends AppCompatActivity {

    private Button btnchuyen;
    private EditText namdl, namal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        btnchuyen=findViewById(R.id.btnChuyen);
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namdl=findViewById(R.id.editNamDL);
                namal=findViewById(R.id.editNamAL);
                int dl=Integer.parseInt(namdl.getText()+"");

                String can=new String();
                String chi=new String();
                switch (dl%10){
                    case 0: can="Canh";break;
                    case 1: can="Tân";break;
                    case 2: can="Nhâm";break;
                    case 3: can="Qúy";break;
                    case 4: can="Gíap";break;
                    case 5: can="Ất";break;
                    case 6: can="Bính";break;
                    case 7: can="Đinh";break;
                    case 8: can="Mậu";break;
                    case 9: can="Kỷ";break;
                }
                switch (dl%12){
                    case 0: chi="Thân";break;
                    case 1: chi="Dậu";break;
                    case 2: chi="Tuất";break;
                    case 3: chi="Hợi";break;
                    case 4: chi="Tý";break;
                    case 5: chi="Sửu";break;
                    case 6: chi="Dần";break;
                    case 7: chi="Mẹo";break;
                    case 8: chi="Thìn";break;
                    case 9: chi="Tỵ";break;
                    case 10: chi="Ngọ";break;
                    case 11: chi="Mùi";break;
                }

                namal.setText(can+" "+chi);
            }
        });
    }
}
