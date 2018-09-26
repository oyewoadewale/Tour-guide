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
public class PopularHotelFragment extends Fragment {


    public PopularHotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // insert code from activity here

        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.address_hotel_1),
                getString(R.string.hotel_1), R.drawable.hotel_sheraton));
        places.add(new Places(getString(R.string.address_hotel_2),
                getString(R.string.hotel_2), R.drawable.hotel_eko));
        places.add(new Places(getString(R.string.address_hotel_3),
                getString(R.string.hotel_3), R.drawable.hotel_de_renaissance));
        places.add(new Places(getString(R.string.address_hotel_4),
                getString(R.string.hotel_4), R.drawable.hotel_kandg));
        places.add(new Places(getString(R.string.address_hotel_5),
                getString(R.string.hotel_5), R.drawable.hotel_oriental));
        places.add(new Places(getString(R.string.address_hotel_6),
                getString(R.string.hotel_6), R.drawable.hotel_others));
        places.add(new Places(getString(R.string.address_hotel_7), getString(R.string.hotel_7),
                R.drawable.hotel_airbnb));
        places.add(new Places(getString(R.string.address_hotel_8),
                getString(R.string.hotel_8), R.drawable.hotel_others));
        places.add(new Places(getString(R.string.address_hotel_9),
                getString(R.string.hotel_9), R.drawable.hotel_ibis));
        places.add(new Places(getString(R.string.address_hotel_10),
                getString(R.string.hotel_10), R.drawable.hotel_pool));

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
