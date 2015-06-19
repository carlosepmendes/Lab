package com.example.android.lab;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Create dummy data as an array of strings
        String[] data = {
                "trololololol",
                "sup sup sup bros",
                "granadas",
                "bombas",
                "bananas po samu n ficar triste",
                "sei la"
        };

        //Turn the array of strings in a arrayList to have more control and access more functions
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));


        //Create an arrayAdapter to connect data to the listview
        mForecastAdapter = new ArrayAdapter<String>(
          getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forescast_textview,
                weekForecast
        );

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //Get the listView and set the adapter to it
        ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);

        //return inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;

    }

}
