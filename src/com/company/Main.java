package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DailySchedule x = new DailySchedule();
        Appointment A1 = new Appointment(new TimeInterval(1,2));
        Appointment A2 = new Appointment(new TimeInterval(3,4));
        Appointment A3 = new Appointment(new TimeInterval(5,6));
        Appointment A4 = new Appointment(new TimeInterval(7,8));
        Appointment A5 = new Appointment(new TimeInterval(9,10));
        Appointment A6 = new Appointment(new TimeInterval(10,12));
        System.out.println(x.addApprt(A1,false));
        System.out.println(x.addApprt(A2,false));
        System.out.println(x.addApprt(A3,false));
        System.out.println(x.addApprt(A4,false));
        System.out.println(x.addApprt(A5,false));
        System.out.println(x.addApprt(A6,false));
    }
}
