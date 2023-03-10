package com.example.recyclerview3pgr1powtorka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Obrazki> listaObrazkow;

    private void przygotujDane(){
        listaObrazkow = new ArrayList<>();
        listaObrazkow.add(new Obrazki(R.drawable.kwiat1,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat2,"pełnia lata"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat3,"zwiastun jesienny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat4,"zawsze mile widziane"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat6,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat7,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat8,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat1,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat2,"pełnia lata"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat3,"zwiastun jesienny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat4,"zawsze mile widziane"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat6,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat7,"zwiastun wiosny"));
        listaObrazkow.add(new Obrazki(R.drawable.kwiat8,"zwiastun wiosny"));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujDane();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ObrazkiAdapter adapter = new ObrazkiAdapter(this,listaObrazkow);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}