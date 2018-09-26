package com.example.hp.lagostour;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FestivalsFragment extends Fragment {


    public FestivalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // insert code from activity here

        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.desc_festivals_1),
                getString(R.string.festivals_1), R.drawable.eyo_festival));
        places.add(new Places(getString(R.string.desc_festivals_2),
                getString(R.string.festivals_2), R.drawable.black_heritage));
        places.add(new Places(getString(R.string.desc_festivals_3),
                getString(R.string.festivals_3), R.drawable.jazz_festivals));
        places.add(new Places(getString(R.string.desc_festivals_4),
                getString(R.string.festivals_4), R.drawable.yoruba_arts));
        places.add(new Places(getString(R.string.desc_festivals_5),
                getString(R.string.festivals_5), R.drawable.film_festivals));
        places.add(new Places(getString(R.string.desc_festivals_6),
                getString(R.string.festivals_6), R.drawable.boat_regattas));
        places.add(new Places(getString(R.string.desc_festivals_7), getString(R.string.festivals_7),
                R.drawable.food_fest));


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
