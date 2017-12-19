package com.by;

import java.util.Timer;

public class TotalInfo {

    private Timer timer;
    private String totalInfo;

    public TotalInfo(Timer timer, String totalInfo) {
        this.timer = timer;
        this.totalInfo = totalInfo;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public String getTotalInfo() {
        return totalInfo;
    }

    public void setTotalInfo(String totalInfo) {
        this.totalInfo = totalInfo;
    }
}
