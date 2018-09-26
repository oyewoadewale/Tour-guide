package com.example.hp.lagostour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TouristAttractionFragment extends Fragment {


    public TouristAttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // insert code from activity here

        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.desc_tourist_1), getString(R.string.tourist_1),
                R.drawable.tour_national_theatre));
        places.add(new Places(getString(R.string.desc_tourist_2),
                getString(R.string.tourist_2), R.drawable.tour_museum));
        places.add(new Places(getString(R.string.desc_tourist_3),
                getString(R.string.tourist_3), R.drawable.tour_africashrine));
        places.add(new Places(getString(R.string.desc_tourist_4), getString(R.string.tourist_4),
                R.drawable.tour_hiimpact));
        places.add(new Places(getString(R.string.desc_tourist_5),
                getString(R.string.tourist_5), R.drawable.tour_lcs));
        places.add(new Places(getString(R.string.desc_tourist_6),
                getString(R.string.tourist_6), R.drawable.tour_tarkwabay));
        places.add(new Places(getString(R.string.desc_tourist_7),
                getString(R.string.tourist_7), R.drawable.tour_lekkileisure));
        places.add(new Places(getString(R.string.desc_tourist_8),
                getString(R.string.tourist_8), R.drawable.tour_terrakulture));
        places.add(new Places(getString(R.string.desc_tourist_9),
                getString(R.string.tourist_9), R.drawable.tour_elegushi));


        // Create an {@link TourAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xmlml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
