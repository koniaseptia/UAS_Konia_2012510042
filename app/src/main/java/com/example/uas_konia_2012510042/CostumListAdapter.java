package com.example.uas_konia_2012510042;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CostumListAdapter{

//    private static final String TAG = "itemadapter";
//
//    private Context mContext;
//    private int mResource;
//    private int lastPosition = -1;
//
//    public CostumListAdapter(@NonNull Context context, int resource, ArrayAdapter<itemmodel> objects) {
//        super(context, resource, (List<itemmodel>) objects);
//        mContext = context;
//        mResource = resource;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        String item = (String) getItem(position).getItem();
//        String harga = (String) getItem(position).getHarga();
//        try {
//            final View result;
//
//            RecyclerView.ViewHolder holder;
//
//            if(convertView == null){
//                LayoutInflater inflater = LayoutInflater.from(mContext);
//                convertView = inflater.inflate(mResource, parent, false);
//                RecyclerView.ViewHolder holder;
//                holder = new RecyclerView.ViewHolder();
//                holder. = (TextView) convertView.findViewById(R.id.tvitem);
//                holder. = (TextView) convertView.findViewById(R.id.tvharga);
//
//                result = convertView;
//
//                convertView.setTag(holder);
//            }else{
//                holder = (RecyclerView.ViewHolder) convertView.getTag();
//                result = convertView;
//            }
//            return convertView;
//        } catch (IllegalArgumentException e) {
//            Log.e(TAG, "getView: IllegalArgumentException:" + e.getMessage());
//            return convertView;
//        }
//
//    }
}


