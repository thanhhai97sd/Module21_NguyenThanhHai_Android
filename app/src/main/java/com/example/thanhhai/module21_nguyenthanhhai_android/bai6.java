package com.example.thanhhai.module21_nguyenthanhhai_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class bai6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);


        ListView lv=(ListView) findViewById(R.id.listView1);
        final String[] myStringArray = getResources().getStringArray(R.array.ten);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myStringArray);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text=parent.getItemAtPosition(position).toString();
                Toast.makeText(bai6.this, "Chọn thành công", Toast.LENGTH_SHORT).show();

                TextView tv1=findViewById(R.id.textView1);
                tv1.setText("Position "+position +"  Value = " +text );
            }
        });

    }
}
