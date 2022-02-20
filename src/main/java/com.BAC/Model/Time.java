package com.BAC.Model;

public interface Time {
    void setTime(long start);
    void setEnd(long end);
    long getStart();
    long getEnd();
    long timeElapsed(long start, long end);
}
