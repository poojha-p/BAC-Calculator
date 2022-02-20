package com.BAC.Model;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class TimeImpl implements Time{
    protected long startTime;
    protected long endTime;
    protected long elapsed;

    public TimeImpl(){

    }

    @Override
    public void setTime(long start) {

    }

    @Override
    public void setEnd(long end) {

    }

    @Override
    public long getStart() {
        return 0;
    }

    @Override
    public long getEnd() {
        return 0;
    }

    @Override
    public long timeElapsed(long start, long end) {
        return 0;
    }
}
