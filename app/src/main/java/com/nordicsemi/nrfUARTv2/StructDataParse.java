package com.nordicsemi.nrfUARTv2;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;



public class StructDataParse {
    private static final int TAG_ID_LENGTH = 8;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static DataPacket parseData(byte[] recv) {
        DataPacket tmp = new DataPacket();
        String tagId = new String();
        int voltage = 0;
        for (int i = 4; i < 12; i++) {
            tagId = tagId + (byteToHex(recv[i]));
        }
        voltage =  recv[12] & 0xff;

//        if(flag != 0){
//            voltage = ~recv[12]+1;
//        }else{
//            voltage = recv[12];
//        }
//        for(int i=0; i < TAG_ID_LENGTH; i++) {
//            tagId += String.format("%02x", recv[i + 5]);
//        }
//
//        voltage = recv[8 + 5] & 0x00ff;

        tmp.setTagId(tagId);
        tmp.setVoltage(voltage);

        return tmp;
    }
    public static String byteToHex(byte b){
        String hex = Integer.toHexString(b & 0xFF);
        if(hex.length() < 2){
            hex = "0" + hex;
        }
        return hex;
    }
}

