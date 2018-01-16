package com.example.nicol.aplikacjapogodowa2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listamiejsc)
    Button buttonListaMiejsc;

    @BindView(R.id.zmienmiejsce)
    Button buttonZmienMiejsce;

    @BindView(R.id.edittext)
    EditText edycjaMiasta;

    @BindView(R.id.zabrze)
    TextView miasto;

    @BindView(R.id.zdjecie)
    ImageView pogoda;


    @OnClick(R.id.zmienmiejsce)
    void onClickZmien() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        String edycjamiasta = edycjaMiasta.getText().toString();
        miasto.setText(edycjamiasta);
        Bundle bundle = new Bundle();
        bundle.putString("item", edycjamiasta);
        intent.putExtras(bundle);
    }

    @OnClick(R.id.listamiejsc)
    void onClickLista() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Glide.with(MainActivity.this)
                .load("https://publicdomainvectors.org/photos/sivvus_weather_symbols_1.png")
                .into(pogoda);
    }
}
