package com.example.uas_konia_2012510042.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uas_konia_2012510042.MainActivity2;
import com.example.uas_konia_2012510042.R;
import com.example.uas_konia_2012510042.model.IModel;

import java.util.ArrayList;

public class itemadapter extends RecyclerView.Adapter<itemadapter.ViewHolder> {

    private final ArrayList<IModel> itemlist;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        IModel imodel = itemlist.get(position);
        holder.tvitem.setText(imodel.item);
        holder.tvharga.setText(imodel.harga);
    }

    @Override
    public int getItemCount() {
        if (itemlist != null)
            return  itemlist.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvitem;
        TextView tvharga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvitem = (TextView) itemView.findViewById(R.id.tvitem);
            tvharga = (TextView) itemView.findViewById(R.id.tvharga);
        }
    }

    public itemadapter(MainActivity2 mainActivity2, int activity_main2, ArrayList<IModel> itemlist){
        this.itemlist = itemlist;
    }
}
