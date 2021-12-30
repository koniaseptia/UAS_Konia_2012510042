package com.example.uas_konia_2012510042;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Object ListView;
    List<String> harga = new ArrayList<String>();
    List<String> item = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        String sitem = intent.getStringExtra("item");
        String sharga = intent.getStringExtra("harga");

        ArrayList<itemmodel> arrayitem = new ArrayList<itemmodel>();
        config uconfig = new config(this, arrayitem);
        ListView alist= (ListView) findViewById(R.id.list_itemharga);
        alist.setAdapter(uconfig);

        itemmodel adddata = new itemmodel(sitem, sharga);
        uconfig.addAll(adddata);

//

//                (ArrayList<String>) getIntent().getSerializableExtra("harga");
//        List<String> item = (ArrayList<String>) getIntent().getSerializableExtra("item");

//        Toast.makeText(getApplicationContext(), "harga : " + harga + " item" + item, Toast.LENGTH_SHORT).show();


    }
}