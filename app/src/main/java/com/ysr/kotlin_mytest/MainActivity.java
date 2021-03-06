package com.ysr.kotlin_mytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements RclViewDialog.onItemClick {

    private TextView subtract;
    private List<Data> list = new ArrayList<>();
    private RclViewDialog dialog;
    private String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data data = new Data();
        data.setType("dwada");
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        list.add(data);
        type = "11";
        dialog = new RclViewDialog(MainActivity.this, list,type);
        dialog.setItemClickListener(this);
        subtract = (TextView) findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
    }

    @Override
    public void onItemClick(Data data,String type) {
        Log.e("eeeee", data.getType());
        Log.e("eeeee", type);
    }
}
