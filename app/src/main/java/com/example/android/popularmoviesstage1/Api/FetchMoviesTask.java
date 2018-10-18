package com.example.android.popularmoviesstage1.Api;

import android.os.AsyncTask;

import com.example.android.popularmoviesstage1.BuildConfig;
import com.example.android.popularmoviesstage1.Movie;
import com.example.android.popularmoviesstage1.Main.MovieAdapter;

import java.net.URL;
import java.util.List;

public class FetchMoviesTask extends AsyncTask<String, Void, List<Movie>> {
    private MovieAdapter adapter;
    public FetchMoviesTask(MovieAdapter adapter) (this.adapter = adapter;)

    @Override
    protected List<Movie> doInBackground(String... params) {
        URL moviesRequestUrl = NetUtils.buildUrl(BuildConfig.API_KEY, params[0]);
        try {
            String jsonMoviesResponse = NetUtils
                    .getResponseFromHttpUrl(moviesRequestUrl);
            MovieCollection movieCollection = MoviesJsonUtils.parseJson(jsonMoviesResponse);
            return  movieCollection.getMovies();

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    @Override
    protected void onPostExecute(List<Movie> movies) {
        if (movies != null) {
            adapter.setMoviesData(movies);

        }
    }
}
