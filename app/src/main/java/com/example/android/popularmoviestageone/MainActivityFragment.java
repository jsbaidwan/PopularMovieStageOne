package com.example.android.popularmoviestageone;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.Arrays;

/**
 * Created by jsbaidwan on 06/02/17.
 */

public class MainActivityFragment extends Fragment {

    private ImageAdapter movieImageAdapter;

    Movie [] movieData = {
            new Movie(R.drawable.a),
            new Movie(R.drawable.a),
            new Movie(R.drawable.a),
            new Movie(R.drawable.a)



    };

    public MainActivityFragment()   {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        movieImageAdapter = new ImageAdapter(getActivity(), Arrays.asList(movieData));

        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        gridView.setAdapter(movieImageAdapter);

        return rootView;

    }
}
