package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> pokemons = new ArrayList<>();
        pokemon p1 = new pokemon("bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemon p2 = new pokemon("ivysaur",R.drawable.ivysaur,62,63,405);
        pokemon p3 = new pokemon("venusaur",R.drawable.venusaur,82,83,525);
        pokemons.add(p1);
        pokemons.add(p2);
        pokemons.add(p3);
        RecyclerView x = findViewById(R.id.rv);
        x.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        x.setLayoutManager(lm);
        pokemonadapter pa = new pokemonadapter(pokemons,this);
        x.setAdapter(pa);
        x.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));


    }
}