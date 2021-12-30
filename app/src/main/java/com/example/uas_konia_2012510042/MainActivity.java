package com.example.uas_konia_2012510042;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.TextView;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//import android.view.View;
//import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import org.w3c.dom.Text;
//import android.widget.Spinner;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //    config dbcontrol = new config(this);
    private Spinner spinner1;
    TextView textView1;
    Button add;

    String[] text1 = { "Pilih Item","Komputer", "Laptop", "TV",
            "Radio", "Telephone", "CPU", "Handphone" };
    int[] val1 = { 0, 10000, 5000000, 700000, 400000, 700000, 2500000, 6000000};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner);
//        spinner1.setOnItemSelectedListener(new ItemSelectedListener());
        textView1 = (TextView)findViewById(R.id.text1);
        add = (Button) findViewById(R.id.button4);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, text1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(onItemSelectedListener);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String  harga =  textView1.getText().toString();
            String item = spinner1.getSelectedItem().toString();
//                List<String> listitem = new ArrayList<String>();
//                List<String>  listharga = new ArrayList<String>();
//                listitem.add(item);
//                listharga.add(harga);

//                Toast.makeText(getApplicationContext(), "harga : " + harga + " item" + item, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("item", item);
                intent.putExtra("harga", harga);
                startActivity(intent);
            }
        });

    }

    OnItemSelectedListener onItemSelectedListener =
            new OnItemSelectedListener(){

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String s1 = String.valueOf(val1[position]);
                    textView1.setText(s1);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}

            };

    //define our custom class
    public class MyClass{
        private String text;
        private int value;

        public MyClass(String text, int value){
            this.text = text;
            this.value = value;
        }
        public void setText(String text){
            this.text = text;
        }
        public String getText(){
            return this.text;
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            return this.value;
        }
    }

    //custom adapter
    public class MySpinnerAdapter extends ArrayAdapter<MyClass>{

        private Context context;
        private MyClass[] myObjs;

        public MySpinnerAdapter(Context context, int textViewResourceId,
                                MyClass[] myObjs) {
            super(context, textViewResourceId, myObjs);
            this.context = context;
            this.myObjs = myObjs;
        }

        public int getCount(){
            return myObjs.length;
        }

        public MyClass getItem(int position){
            return myObjs[position];
        }

        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) { TextView label = new TextView(context);label.setText(myObjs[position].getText());
            return label;
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) { TextView label = new TextView(context);label.setText(myObjs[position].getText());
            return label;
        }
    }

}




//    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {
//
//        //get strings of first item
//        String firstItem = String.valueOf(spinner1.getSelectedItem());
//        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {
//            } else {
//                Toast.makeText(parent.getContext(),
//                        "Anda telah memilih : " + parent.getItemAtPosition(pos).toString(),
//                        Toast.LENGTH_LONG).show();
//
//            }
//        }
//        @Override
//        public void onNothingSelected(AdapterView<?> arg) {
//
//        }
//
//    }
