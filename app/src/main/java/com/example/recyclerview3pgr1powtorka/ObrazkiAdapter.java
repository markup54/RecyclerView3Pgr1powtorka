package com.example.recyclerview3pgr1powtorka;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ObrazkiAdapter extends RecyclerView.Adapter <ObrazkiAdapter.ObrazkiViewHolder> {

    @NonNull
    @Override
    public ObrazkiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ObrazkiViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ObrazkiViewHolder extends RecyclerView.ViewHolder {
        public ObrazkiViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
