package com.example.android.popularmoviesstage1;

import android.content.Context;
import android.util.DisplayMetrics;

//! Class to help determine the number of images on the grid!//
public class ImageGrid {
    public static int calculateColumns(Context context){
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int numColumns = (int) (dpWidth / 180);

        if (numColumns < 2)
            return 2;
        else
            return numColumns;
    }
}
