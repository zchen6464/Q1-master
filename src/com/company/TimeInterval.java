package com.company;

public class TimeInterval {
    private int start,end;
    public TimeInterval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    public boolean overlapsWith(TimeInterval interval)
    {
        return (new TimeInterval(start,end) == interval);
    }
}
