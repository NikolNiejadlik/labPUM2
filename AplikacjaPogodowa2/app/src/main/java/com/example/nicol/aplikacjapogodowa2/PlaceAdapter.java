package com.example.nicol.aplikacjapogodowa2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nicol on 2018-01-15.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private ArrayList<Place> miejsca = new ArrayList<>();

    PlaceAdapter(ArrayList<Place> miejsca) {
        this.miejsca = miejsca;
    }

    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(miejsca.get(position).getName()+"");
        holder.setTemperature(miejsca.get(position).getTemperature()+"");
        holder.setInformation(miejsca.get(position).getInformation()+"");
    }

    @Override
    public int getItemCount() {
        return miejsca.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.nazwa)
        TextView name1;

        @BindView(R.id.temperatura)
        TextView temp1;

        @BindView(R.id.informacja)
        TextView info;

        @BindView(R.id.wybierzmiejsce)
        TextView wybieracz;

        @OnClick(R.id.wybierzmiejsce)
        void clickCity(TextView wybieracz)
        {
            openAlertDialog();
        }

        private void openAlertDialog() {

        }

        @OnClick(R.id.nazwa)
        void onNameClick() {
            Intent intent = new Intent(itemView.getContext(), MainActivity.class);
            itemView.getContext().startActivity(intent);
        }


        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void setName(String name) {
            name1.setText(name);
        }

        private void setTemperature(String name)
        {
            temp1.setText(name);
        }

        private void setInformation(String name) {
            info.setText(name);
        }
    }

}

