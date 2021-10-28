package com.example.pf_sistemainventarioitt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class PanelActivity extends AppCompatActivity {

    private HeaderAdapter headerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Product> myDataset = new ArrayList<>();
        myDataset.add(new Product("101","Juan Perez","27 de Octubre del 2021"));
        myDataset.add(new Product("102","Juan Perez","28 de Octubre del 2021"));
        myDataset.add(new Product("103","Juan Perez","29 de Octubre del 2021"));

        headerAdapter = new HeaderAdapter(myDataset);
        recyclerView.setAdapter(headerAdapter);
    }
}