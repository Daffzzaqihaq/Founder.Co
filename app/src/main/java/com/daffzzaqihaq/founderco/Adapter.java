package com.daffzzaqihaq.founderco;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daffzzaqihaq.bacain.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    int[] gambarFounder;
    String[] namaFounder,detailFounder;

    public Adapter(Context context,int[] gambarFounder, String[] namaFounder, String[] detailFounder){
        this.context = context;
        this.gambarFounder = gambarFounder;
        this.namaFounder = namaFounder;
        this.detailFounder = detailFounder;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_founder, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtNama.setText(namaFounder[i]);
        Glide.with(context).load(gambarFounder[i]).into(viewHolder.imgLogo);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,DetailFounderActivity.class);
                pindah.putExtra("nb",namaFounder[i]);
                pindah.putExtra("db",detailFounder[i]);
                pindah.putExtra("gb",gambarFounder[i]);
                context.startActivity(pindah);

            }
        });
    }



    @Override
    public int getItemCount() {
        return gambarFounder.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgList);
            txtNama = itemView.findViewById(R.id.txtListTitle);

        }
    }
}

