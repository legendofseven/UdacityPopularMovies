package com.example.android.popularmoviesstage1.Api;

import android.app.DownloadManager;
import android.net.Uri;
import android.util.Log;

import com.example.android.popularmoviesstage1.BuildConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class NetUtils {
    private static final String LOG_TAG = NetUtils.class.getCanonicalName();
    //The Movie DB URl Base and Path
    private static final String TMDB_URL_BASE = "http:api.themoviedb.org";
    private static final String TMDB_PATH = "3/movie/";
    //API KEY Handlers
    private static final String API_KEY = "key";
    private static final String API_KEY_ACTUAL = BuildConfig.API_KEY;
    //MovieDB sort options
    private static final String POP_MOVIES = "pop";
    private static final String TOP_MOVIES = "top";
    //MovieDB queries
    private static final String QUERY = "?";
    private static final String AND = "&";
    private static final String EQUALS = "=";
    //JSON response
    private static final String JPAGE = "page";



    //Url build for Popular Movies query
    private static final String POP_QUERY = ""
            + TMDB_URL_BASE + TMDB_PATH + POP_MOVIES + QUERY + API_KEY + EQUALS + API_KEY_ACTUAL;
    private static final String TOP_QUERY = ""
            + TMDB_URL_BASE + TMDB_PATH + TOP_MOVIES + QUERY + API_KEY + EQUALS + API_KEY_ACTUAL;

    //MovieDB Api URL builder

    public static URL buildUrl(String urlbuilt) {
        Uri uriBuilt = Uri.parse(urlbuilt).buildUpon().build();

        URL url = null;
        try {
            url = new URL(uriBuilt.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            Log.e(LOG_TAG, "URL cannot build  " + e.getMessage());
        }
        return url;



        }
        //Movie object, MF
    public static M

    }
}
