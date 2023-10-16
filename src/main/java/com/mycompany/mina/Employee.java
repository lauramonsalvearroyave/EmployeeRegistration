package com.mycompany.mina;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Employee extends Person {

    private Date startTime;
    private Date endTime;

    public Employee(Date startTime, Date endTime, String name, String id) {
        super(name, id);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long calculatedHoursWorked() {
        var diff = endTime.getTime() - startTime.getTime();
        TimeUnit timeUnit = TimeUnit.HOURS;
        return timeUnit.convert(diff, TimeUnit.MILLISECONDS);
    }
}
