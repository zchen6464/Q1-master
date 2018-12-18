package com.company;

public class Appointment {
    private TimeInterval interval;
    public Appointment(TimeInterval interval)
    {
        this.interval = interval;
    }
    public TimeInterval getTime()
    {
        return this.interval;
    }
    public boolean conflictsWith (Appointment other)
    {
        return getTime().overlapsWith(other.getTime());
    }
}
