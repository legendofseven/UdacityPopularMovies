package com.example.android.popularmoviesstage1;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.popularmoviesstage1.Main.MovieObj;

import java.net.URL;
import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {
    public static MovieObj[] popularityMovieObjArray;
    public static MovieObj[] voteAverageMovieObjArray;
    private TextView mErrorTextView;
    private static String error;
    private static boolean dataNotFetched = false;
    private final ArrayList<MovieObj[]> popularityAndVote = new ArrayList<>();
    private URL queryUrlObjectPopularity;
    private URL queryUrlObjectVoteAverage;
    private ImageView splashImage;
    private ImageButton imageButton;

//! // 1. Bundle
    // 2. error if internet is unavailble so it doesnt crash
    // 3. Async task to fetch data
    // 4. array movie list in background
//
}
