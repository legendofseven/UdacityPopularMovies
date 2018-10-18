package com.example.android.popularmoviesstage1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MovieClickFragment extends Fragment {
    private String mOriginalTitle;
    private String mPosterpath;
    private Double mVoteAverage;
    private Double mPopularity;
    private String mOverview;
    private String mReleaseDate;
    private int mId;

    public MovieClickFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.movie_click_fragment, container, false);

    }


private void restoreExtras (Bundle extras){
    mOriginalTitle = extras.getString("mOriginalTitle");
    mPosterpath = extras.getString("mPosterPath");
    mVoteAverage = extras.getDouble("mVoteAverage");
    mPopularity = extras.getString("mPopularity");

}
