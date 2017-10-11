package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dhanushka Sandaruwan on 10/12/2017.
 */

class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    public EarthquakeAdapter( Context context, List<Earthquake> earthquakes) {
        super(context, 0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemview =convertView;
        if(listItemview==null){
            listItemview= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);

        }
        Earthquake currentEarthquake=getItem(position);
        TextView mview= (TextView) listItemview.findViewById(R.id.magnitude);
        mview.setText(currentEarthquake.getmMagnitude());
        TextView lview= (TextView) listItemview.findViewById(R.id.locaion);
        lview.setText(currentEarthquake.getmLocation());
        TextView dview= (TextView) listItemview.findViewById(R.id.date);
        dview.setText(currentEarthquake.getmDate());
        return listItemview;

    }
}
