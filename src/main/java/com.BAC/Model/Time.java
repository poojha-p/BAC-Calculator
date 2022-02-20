package com.BAC.Model;

import java.time.Duration;
import java.time.Instant;

public interface Time {
    void setTime(Instant start);
    void setEnd(Instant end);
    Instant getStart();
    Instant getEnd();
    double timeElapsed(Instant start, Instant end);
}
