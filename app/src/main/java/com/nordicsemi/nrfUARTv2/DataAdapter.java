package com.nordicsemi.nrfUARTv2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.nordicsemi.nrfUARTv2.MainActivity.TAG;


public class DataAdapter extends ArrayAdapter<DataPacket> {
    private int resourceId;

    public DataAdapter(Context context, int resource, List<DataPacket> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataPacket dataPacket = getItem(position);
        if(dataPacket.getFlag() == 1) {
            View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            TextView tagId = (TextView) view.findViewById(R.id.tagId);
            TextView voltage = (TextView) view.findViewById(R.id.voltage);
            TextView index = (TextView) view.findViewById(R.id.index);
            int num = dataPacket.getVoltage();
            Log.d(TAG, "getView: "+dataPacket.getVoltage());
            double grade = (double)num/225*3.6;
            Log.e(TAG, "getView: "+getContext() );
            Log.d(TAG, "getView: "+grade);
            if(grade>3.0){
                voltage.setText("高");
            }else if(grade >2.5  && grade <3.0){
                voltage.setText("中");
            }else{
                voltage.setText("低");
                voltage.setTextColor(getContext().getColor(R.color.red));
            }
            index.setText(position+1+"");
            tagId.setText(dataPacket.getTagId());
            //voltage.setText(dataPacket.getVoltage() + "");
            return view;
        }else{
            View view = LayoutInflater.from(getContext()).inflate(R.layout.events_list, parent, false);
            TextView textView = (TextView) view.findViewById(R.id.events);
            textView.setText(dataPacket.getTagId());
            return view;
        }

    }
}
