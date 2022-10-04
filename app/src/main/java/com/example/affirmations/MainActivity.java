package com.example.affirmations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.affirmations.adapter.ItemAdapter;
import com.example.affirmations.data.Datasource;
import com.example.affirmations.databinding.ActivityMainBinding;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Affirmation> dataset = new Datasource().loadAffirmations();
        binding.recyclerView.setAdapter(new ItemAdapter(MainActivity.this, dataset));
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        binding.recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        binding.recyclerView.setHasFixedSize(true);
    }
}