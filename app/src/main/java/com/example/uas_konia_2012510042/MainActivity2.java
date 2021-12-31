package com.example.uas_konia_2012510042;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uas_konia_2012510042.adapter.itemadapter;
import com.example.uas_konia_2012510042.model.IModel;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<String> mlist = new ArrayList<String>();
    itemadapter madapter;

    private Object ListView;
//    List<String> harga = new ArrayList<String>();
//    List<String> item = new ArrayList<String>();
//    ArrayList<itemmodel> itemmodels = new ArrayList<>();

    Button mhapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//
//        CardView recyclerView = (CardView) findViewById(R.id.list_itemharga) ;
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        madapter = new itemadapter(this, R.layout.activity_main2,mlist);
//        recyclerView.setAdapter
//
//        listView = (ListView) findViewById(R.id.listview);
        ArrayList<IModel> list = new ArrayList<IModel>();
//
        Intent intent = getIntent();
//
//        mhapus = (Button) findViewById(R.id.remove);

        String sitem = intent.getStringExtra("item");
        String sharga = intent.getStringExtra("harga");
//
//        list.add(sitem);
//        list.add(sharga);
        itemadapter adapter = new itemadapter(this, R.layout.activity_main2, list);
//        list.set(adapter);


//        ArrayList<itemmodel> arrayitem = new ArrayList<itemmodel>();
//        config uconfig = new config(this, arrayitem);
////       ListView alist= (ListView) findViewById(R.id.list_itemharga);
//        CardView  alist= (CardView) findViewById(R.id.list_itemharga);

//
//        itemmodel adddata = new itemmodel(sitem, sharga);
//        uconfig.addAll(adddata);

        mhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//

//               (ArrayList<String>) getIntent().getSerializableExtra("harga");
//        List<String> item = (ArrayList<String>) getIntent().getSerializableExtra("item");

//        Toast.makeText(getApplicationContext(), "item : " + sitem + " harga" + sharga, Toast.LENGTH_SHORT).show();


    }
}