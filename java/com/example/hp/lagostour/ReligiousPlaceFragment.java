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
public class ReligiousPlaceFragment extends Fragment {


    public ReligiousPlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // insert code from activity here


        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.president_religion_1),
                getString(R.string.religion_1), R.drawable.religion_cembassy));
        places.add(new Places(getString(R.string.president_religion_2),
                getString(R.string.religion_2), R.drawable.religion_reedem));
        places.add(new Places(getString(R.string.president_religion_3),
                getString(R.string.religion_3), R.drawable.religion_deeper));
        places.add(new Places(getString(R.string.president_religion_4),
                getString(R.string.religion_4), R.drawable.religion_daystar));
        places.add(new Places(getString(R.string.president_religion_5),
                getString(R.string.religion_5), R.drawable.religion_covenant));
        places.add(new Places(getString(R.string.president_religion_6),
                getString(R.string.religion_6), R.drawable.religion_winners));


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
