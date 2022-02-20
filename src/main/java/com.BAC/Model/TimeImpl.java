package com.BAC.Model;
import java.time.Duration;
import java.time.Instant;

public class TimeImpl implements Time{
    protected Instant startTime;
    protected Instant endTime;
    protected Duration elapsed;

    public TimeImpl(){
        this.startTime = Instant.now();

    }

    @Override
    public void setTime(Instant start) {
        this.startTime = start;

    }

    @Override
    public void setEnd(Instant end) {
        this.endTime = Instant.now();
    }

    @Override
    public Instant getStart() {
        return this.startTime;
    }

    @Override
    public Instant getEnd() {
        return this.endTime;
    }

    @Override
    public double timeElapsed(Instant start, Instant end) {
        Duration timeElapsed = Duration.between(start, end);
        double hour = (double)timeElapsed.toHours() / 3600000;
        return hour;
    }
}
