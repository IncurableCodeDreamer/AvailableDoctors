package com.example.student.kolokwiumpum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.Recycler)
    RecyclerView Recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        Recycler.setLayoutManager(layoutManager);

        ArrayList<Lekarz>lekarze = new ArrayList<>();
        lekarze.add(new Lekarz ("Jan Kowalski","dermatolog"));
        lekarze.add(new Lekarz("Marta Mocna","rodzinny"));
        lekarze.add(new Lekarz("Maciek Slifka", "neurolog"));
        lekarze.add(new Lekarz("Alicja Domagala", "onkolog"));

        LekarzAdapter lekarzAdapter = new LekarzAdapter(lekarze);
        Recycler.setAdapter(lekarzAdapter);
    }
}
