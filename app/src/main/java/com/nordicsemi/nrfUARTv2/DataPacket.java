package com.nordicsemi.nrfUARTv2;

public class DataPacket {
    private String tagId;
    private  int voltage;
    private  int flag;

    public DataPacket(String tagId, int voltage) {
        this.tagId = tagId;
        this.voltage = voltage;
    }

    public DataPacket(String tagId, int voltage, int flag) {
        this.tagId = tagId;
        this.voltage = voltage;
        this.flag = flag;
    }

    public DataPacket() {

    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
