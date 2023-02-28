package com.example.recyclerhorizontal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterSkin extends RecyclerView.Adapter<AdapterSkin.MyViewHolder> {

    private List<Skin> skinList;

    public AdapterSkin(List<Skin> skinList) {
        this.skinList = skinList;
    }

    @NonNull
    @Override
    public AdapterSkin.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSkin.MyViewHolder holder, int position) {
        holder.bindData(skinList.get(position));
    }

    @Override
    public int getItemCount() {
        return skinList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoSkin;
        TextView nomSkin;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSkin = itemView.findViewById(R.id.skinFoto);
            nomSkin = itemView.findViewById(R.id.imageDesc);
        }
        void bindData(final Skin skin){
            fotoSkin.setImageResource(skin.getFoto());
            nomSkin.setText(skin.getNom());
        }
    }
}
