package com.reck.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.reck.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.reck.landmarkbookjava.databinding.ActivityMainBinding;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {


    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;
    //static Landmark chosenLandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eyfel = new Landmark("Eiffel","France",R.drawable.eyfel);
        Landmark colosseum = new Landmark("Colosseum","Italy",R.drawable.colesseum);
        Landmark londonbridge = new Landmark("London Bridge","UK",R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eyfel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonbridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
                );
                binding.listView.setAdapter(arrayAdapter);

                binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick (AdapterView<?> parent, View view, int position, long id){
                        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                        intent.putExtra("landmark",landmarkArrayList.get(position));
                        startActivity(intent);
                    }
        });
        */

    }
}