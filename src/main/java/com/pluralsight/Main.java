package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room theRoom = new Room("King",3,150,false,false);

        Employee intern = new Employee(1234,"Sozin","AppDev",25);

        intern.punchTimeCard(10);

        intern.punchTimeCard(23);

        //System.out.println(intern.getTotalPay());

        Reservation theRes = new Reservation("King", 1,true);

        System.out.println(theRes.getReservationTotal());

    }

}
