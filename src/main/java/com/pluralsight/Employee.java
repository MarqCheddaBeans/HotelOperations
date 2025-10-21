package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean clockedIn;


    public Employee(int id, String name, String department, double payRate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public double getRegularHours(){
        if (hoursWorked <= 40){
            return hoursWorked;
        } else{
            return 40;
        }
    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else{
            return 0;
        }
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getStartTime() {
        return startTime;
    }

    public void punchTimeCard(double time){
        //check if employee is already clocked in
        if(!clockedIn){
            //store start time and clock employee in , display confirmation
            startTime = time;
            clockedIn = true;
            System.out.println("Clocked in at: " + time);
            //employee already clocked in -> clock employee out
        } else{
            //store end time, calculate time worked by employee
            double endTime = time;
            double timeWorked = endTime - startTime;
            //check if employee worked at all
            if(timeWorked > 0){
                //store hours worked
                hoursWorked+=timeWorked;
            }
            //clock employee out and display confirmation
            clockedIn = false;
            System.out.println("Clocked out at: " + time + "\n Hours worked: " + timeWorked);
        }
    }

    public double getTotalPay(){

        double regularPay = getRegularHours() * getPayRate();
        double overtimePay = getOvertimeHours() * (payRate*1.5);

        return regularPay + overtimePay;
    }

}
