package com.example.android.popularmoviesstage1.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.android.popularmoviesstage1.R;

public class MainActivity extends AppCompatActivity {
    private String sortBy;
    private MovieAdapter movieAdapter;
    private RecyclerView movieGrid;
    private TextView errorMessage;
    private ProgressBar loadingIndicator;
    //private static final String SOR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieGrid = findViewById(R.id.movie_grid);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        movieGrid.setLayoutManager(layoutManager);
        movieAdapter = new MovieAdapter(movieAdapter);
        movieGrid.setAdapter(movieAdapter);
        loadingIndicator = findViewById(R.id.loading_indicator);
        errorMessage = findViewById(R.id.error_message);



        ProgressBar progressBar = findViewById(R.id.loading_ind);
        progressBar.setVisibility(View.INVISIBLE);

        // 1. get JSON string from the URL <- do it in the background thread
        // 2. parse JSON string using GSON
        // 3. use GSON to create individual movie objects from json string


        RecyclerView recyclerView = findViewById(R.id.movie_posters);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new MovieAdapter());




    }

}
