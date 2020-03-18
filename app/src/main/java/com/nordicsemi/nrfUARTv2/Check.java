package com.nordicsemi.nrfUARTv2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Check extends Activity {
    private List<DataPacket> list = new ArrayList<DataPacket>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetooth);
        DataAdapter dataAdapter = new DataAdapter(Check.this, R.layout.list_content,list);
        initdata();
        ListView listView = (ListView) findViewById(R.id.bluetooth_list);
        listView.setAdapter(dataAdapter);
    }
    private void initdata(){
        for( int i =0; i<2;i++){
            DataPacket apple = new DataPacket("OX001",2500);
            list.add(apple);
            DataPacket banana = new DataPacket("OX002",2500);
            list.add(banana);
            DataPacket orange = new DataPacket("OX003",2500);
            list.add(orange);
            DataPacket watermelon = new DataPacket("OX004",2500);
            list.add(watermelon);
            DataPacket pear = new DataPacket("OX005",2500);
            list.add(pear);
            DataPacket grape = new DataPacket("OX006",2500);
            list.add(grape);
            DataPacket pineapple = new DataPacket("OX007",2500);
            list.add(pineapple);
            DataPacket strawberry = new DataPacket("OX008",2500);
            list.add(strawberry);
            DataPacket cherry = new DataPacket("OX009",2500);
            list.add(cherry);
            DataPacket mango = new DataPacket("OX0010",2500);
            list.add(mango);

        }
    }
}
