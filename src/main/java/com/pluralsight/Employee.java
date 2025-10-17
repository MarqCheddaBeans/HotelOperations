package com.pluralsight;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double getTotalPay(double payRate,double hoursWorked){
        return payRate*hoursWorked;
    }
    public double getRegularHours(double hoursWorked){
        double regularHours;
        if (hoursWorked <= 40){
            return hoursWorked;
        } else{
            return 40;
        }
    }

    public double getOvertimeHours(double hoursWorked){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else{
            return 0;
        }
    }


}
