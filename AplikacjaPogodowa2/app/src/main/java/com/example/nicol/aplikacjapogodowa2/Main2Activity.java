package com.example.nicol.aplikacjapogodowa2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        ArrayList<Place> miejsca = new ArrayList<>();
        miejsca.add(new Place("Zabrze", 25,  "Ciepło"));
        miejsca.add(new Place("Bytom",26, "Ciepło"));
        miejsca.add(new Place("Gliwice",24,"Ciepło i deszczowo"));
        miejsca.add(new Place("Berlin",32,"Gorąco"));
        miejsca.add(new Place("Francja",25,"Ciepło i burzowo"));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        PlaceAdapter placeAdapter = new PlaceAdapter(miejsca);
        recyclerView.setAdapter(placeAdapter);

    }

    public void clickCity(View view) {
        Intent intent=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);

    }
}
