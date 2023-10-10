package com.mycompany.mina;

public class Employee extends Person {
    private int startTime;
    private int endTime;


    public Employee(int startTime, int endTime, String name) {
        super(name);
        this.startTime = startTime;
        this.endTime = endTime;
    }
 
    public int calculatedHoursWorked () {
        return endTime - startTime;
    }
}
