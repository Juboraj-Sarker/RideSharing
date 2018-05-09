package com.juborajsarker.rideshareing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class MapFragment extends Fragment {

    View view;
    LinearLayout ourService;


    public MapFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_map, container, false);




        return view;
    }


}
