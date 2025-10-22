package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room theRoom = new Room("King",3,150,false,false);

        Employee intern = new Employee(1234,"Sozin","AppDev",25);

//        intern.punchTimeCard(10);

//        intern.punchTimeCard(23);

        Reservation theRes = new Reservation("King", 1,true);

        intern.punchTimeCard();

        intern.punchTimeCard();

        System.out.println(intern.getTotalPay());

        Hotel crappyHotel = new Hotel("CrappyHotel",5,5);
        crappyHotel.bookRoom(4,true);
        crappyHotel.bookRoom(5,false);

        System.out.println(crappyHotel.getAvailableSuites() + " Suites");
        System.out.println(crappyHotel.getAvailableRooms() + " Rooms");

        System.out.println(crappyHotel.getNumOfSuites() + " num of Suites" );
        System.out.println(crappyHotel.getNumOfRooms() + " num of Rooms");

        System.out.println(crappyHotel.getBookedSuites() + " booked suites");
        System.out.println(crappyHotel.getBookedRooms() + " booked rooms");

    }
}
