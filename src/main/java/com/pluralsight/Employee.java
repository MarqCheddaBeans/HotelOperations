package com.pluralsight;

import java.time.Duration;
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

    public Employee(String name,double hoursWorked, double payRate){
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee(String name,double payRate){
        this.name = name;
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
            hoursWorked = endTime - startTime;
            //clock employee out and display confirmation
            clockedIn = false;
            System.out.println("Clocked out at: " + time + "\n Hours worked: " + hoursWorked);
        }
    }

    public void punchTimeCard(){
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime clockInTime = LocalTime.now();
        LocalTime clockOutTime;

        if(!clockedIn){
            //clockInTime = LocalTime.now();
            String formattedClockIn = clockInTime.format(timeFormat);
            clockedIn = true;

            System.out.println("Clocked in at: " + formattedClockIn);

        }else{

            clockOutTime = LocalTime.now().plusHours(9).plusMinutes(31);
            String formattedClockOut = clockOutTime.format(timeFormat);

            //Duration class is used to get time difference between two points in time
            Duration timeWorkedDuration = Duration.between(clockInTime,clockOutTime);

            //After getting the time difference, can extract the Hours, Minutes, and/or Seconds then store in variable
            double hours = timeWorkedDuration.toHours();
            //get total minutes dividing by 60 and taking remainder, 126 minutes == 2hrs 6 min, Duration minutes = 2 min
            double minutes = timeWorkedDuration.toMinutes() % 60;

            hoursWorked += (hours + minutes);
            System.out.println("Clocked out at: " + formattedClockOut + " |Hours worked: " + hours + " hours " + minutes + " minutes.");

            clockedIn = false;

        }


    }

    public double getTotalPay(){

        double regularPay = getRegularHours() * getPayRate();
        double overtimePay = getOvertimeHours() * (payRate*1.5);
        System.out.println("Total pay is: " + (regularPay+overtimePay));

        return regularPay + overtimePay;
    }

}
