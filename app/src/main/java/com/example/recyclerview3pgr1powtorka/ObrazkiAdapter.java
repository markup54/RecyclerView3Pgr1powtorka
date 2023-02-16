package com.example.recyclerview3pgr1powtorka;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ObrazkiAdapter extends RecyclerView.Adapter <ObrazkiAdapter.ObrazkiViewHolder> {

    private final ArrayList<Obrazki> listaObrazkow;
    private LayoutInflater inflater;

    public ObrazkiAdapter(Context context, ArrayList<Obrazki> listaObrazkow) {
        inflater =LayoutInflater.from(context);
        this.listaObrazkow = listaObrazkow;
    }

    @NonNull
    @Override
    public ObrazkiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_widok,parent,false);
        return new ObrazkiViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ObrazkiViewHolder holder, int position) {
        holder.textView.setText(listaObrazkow.get(position).getOpisObrazka());
        holder.imageView.setImageResource(listaObrazkow.get(position).getIdObrazka());
        holder.imageView.setContentDescription(listaObrazkow.get(position).getOpisObrazka());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ObrazkiViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        final ObrazkiAdapter obrazkiAdapter;

        public ObrazkiViewHolder(@NonNull View itemView, ObrazkiAdapter obrazkiAdapter) {
            super(itemView);
            imageView =itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            this.obrazkiAdapter = obrazkiAdapter;
        }
    }

}
