package com.vwh.kestrel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vwh on 8/19/2015.
 */
class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] items) {
        super(context, R.layout.custom_row, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView name = (TextView) customView.findViewById(R.id.name);
        ImageView image = (ImageView) customView.findViewById(R.id.image);

        name.setText(singleFoodItem);
        // image.setImageResource(R.drawable.image);
        return customView;
    }
}
