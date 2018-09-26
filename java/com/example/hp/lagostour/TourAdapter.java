package com.example.hp.lagostour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link TourAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Places} objects.
 */
public class TourAdapter extends ArrayAdapter<Places>  {

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Places}s to be displayed.
     */
    public TourAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Places} object located at this position in the list
        Places currentPlaces = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView placesTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentPlaces object and set this text on
        // the Miwok TextView.
        placesTextView.setText(currentPlaces.getNameOfPlaces());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentPlaces object and set this text on
        // the default TextView.
        addressTextView.setText(currentPlaces.getAddressOfPlaces());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        imageView.setImageResource(currentPlaces.getImageResourceId());

        // set the theme color for the list item

        View textContainer = listItemView.findViewById(R.id.text_container);



        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}