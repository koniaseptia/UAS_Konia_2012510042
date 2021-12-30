package com.example.uas_konia_2012510042;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class config extends ArrayAdapter<itemmodel> {

    public config(@NonNull Context context, ArrayList<itemmodel> itemmodels) {
        super(context, 0, itemmodels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         itemmodel item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main2, parent, false);
        }

        TextView tvitem = (TextView) convertView.findViewById(R.id.tvitem);
        TextView tvharga = (TextView) convertView.findViewById(R.id.tvharga);

        tvharga.setText(item.harga);
        tvitem.setText(item.item);

        return convertView;
    }
}

