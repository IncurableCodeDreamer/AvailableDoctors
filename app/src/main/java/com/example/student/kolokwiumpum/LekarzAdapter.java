package com.example.student.kolokwiumpum;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by student on 2018-01-17.
 */

public class LekarzAdapter extends RecyclerView.Adapter<LekarzAdapter.ViewHolder> {

    ArrayList<Lekarz> lekarze = new ArrayList<>();

    LekarzAdapter(ArrayList<Lekarz> lekarze) {
        this.lekarze = lekarze;
    }

    @Override
    public LekarzAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setNazwa(lekarze.get(position).getNazwa());
        holder.setSpecjalnosc(lekarze.get(position).getSpecjalnosc());
    }

    @Override
    public int getItemCount() {
        return lekarze.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.Nazwa)
        TextView Nazwa;
        @BindView(R.id.Specjalizacja)
        TextView Specjalizacja;


        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void setNazwa(String nazwa) {
            Nazwa.setText(nazwa);
        }

        public void setSpecjalnosc(String nazwa) {
            Specjalizacja.setText(nazwa);
        }
    }
}
