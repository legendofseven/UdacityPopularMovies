package com.example.android.popularmoviesstage1.Main;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.popularmoviesstage1.Movie;
import com.example.android.popularmoviesstage1.MovieHolder;
import com.example.android.popularmoviesstage1.R;
import com.example.android.popularmoviesstage1.Api.NetUtils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter  extends RecyclerView.Adapter <MovieHolder> {
    // array of movie objects
    private List<Movie> movies = new ArrayList<>();

    public MovieAdapter() {

    }
    public void setMoviesData(List<Movie> list) {
        movies = list;
        notifyDataSetChanged();
    }
    public class MoviesAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.poster_image)
        ImageView imagePoster;

        public MoviesAdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DetailsActivity.class);
            Movie currentMovie = movies.get(getAdapterPosition());
            intent.putExtra("movieDetails", currentMovie);
            view.getContext().startActivity(intent);

        }
    }
    @Override public int getItemCount() {
        return 5;
    }
    @Override public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.poster_item, parent, false);
        MoviesAdapterViewHolder viewHolder = new MoviesAdapterViewHolder(view);
        return new MovieHolder(view);
    }
    @Override public void onBindViewHolder(MovieHolder movieHolder, int i) {
        Picasso.with(movieHolder.imagePoster.getContext())
                .load(NetUtils.buildPosterUrl(movies.get(position).getPosterPath()))
                .placeholder(R.drawable.pmpopcorn)
                .into(holder.imagePoster);


        //movieHolder.mTextView.setText("test" + i);
    }
}

