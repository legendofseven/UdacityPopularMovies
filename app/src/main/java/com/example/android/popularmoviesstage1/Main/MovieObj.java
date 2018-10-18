package com.example.android.popularmoviesstage1.Main;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.android.popularmoviesstage1.Api.NetUtils;

public class MovieObj implements Parcelable {
    private static final String LOG_TAG = NetUtils.class.getCanonicalName();
    //JSON OBJ
    private final String mOriginalTitle;
    private final Double mVoteAverage;
    private final Double mPopularity;
    private final Double mVoteAverage;
    private final String mOverview;
    private final String mReleaseDate;
    private final int mMovieId;
    //Posterpath and MovieDB URL
    private final String mPosterPath185;
    private final String TMDB_BASE_185 = "https://image.tmdb.org/t/p/w185";

    //movieobj strings
    public MovieObj(String originalTitle, String posterPath, Double popularity, Double voteAverage, String overview, String releaseDate, int movieId) {
        this.mOriginalTitle = originalTitle;
        this.mVoteAverage = voteAverage;
        this.mPopularity = popularity;
        this.mOverview = overview;
        this.mReleaseDate = releaseDate;
        this.mMovieId = movieId;
        this.mPosterPath185 = TMDB_BASE_185 + posterPath.substring(1,posterPath.length());
    }
    //movieobj parcel in
    private MovieObj(Parcel in) {
        mOriginalTitle = in.readString();
        mPosterPath185 = in.readString();
        if (in.readByte() == 0){
            mVoteAverage = null;

        } else {
            mVoteAverage = in.readDouble();

        }
        if (in.readByte() == 0) {
            mPopularity == null;
        } else {
            mPopularity = in.readDouble()
        }
        mOverview = in.readString();
        mReleaseDate = in.readString();
        mMovieId = in.readInt();

    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mOriginalTitle);
        dest.writeString(mPosterPath185);
        if (mVoteAverage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte(byte) 1;
            dest.writeDouble(mVoteAverage);
        }
        if (mPopularity == null) {
            dest.writeByte((byte) 0);
        }else {
            dest.writeByte((byte) 1);
            dest.writeDouble(mPopularity);
        }
        dest.writeString(mOverview);
        dest.writeString(mReleaseDate);
        dest.writeInt(mMovieId);

        }
    }

    @Override
    public int describeContents() {return 0;}
    public static final Creator<MovieObj> CREATOR = new Creator<MovieObj>() {
        @Override
        public MovieObj createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public MovieObj[] newArray(int size) {
            return new MovieObj[0];
        }
    };
    //Referenced MovieObj data get
    public String getmOriginalTitle() { return mOriginalTitle; }
    public String getmPosterPath185() { return mPosterPath185; }
    public Double getmVoteAverage() { return mVoteAverage; }
    public Double getmPopularity() { return mPopularity; }
    public String getmOverview() { return mOverview; }
    public String getmReleaseDate() { return mReleaseDate; }
    public int getmMovieId() { return mMovieId; }

}
