package com.pluralsight;

public class Hotel {

    private String name;
    private int numOfSuites;
    private int numOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numOfSuites, int numOfRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numOfSuites, int numOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumOfSuites() {
        return numOfSuites;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public boolean bookRoom(int rooms, boolean isSuite){

        //A user should be able to book one or more rooms (if they are available). The user
        //will specify how many rooms they would like, and if it is a suite or a basic room

        if(this.numOfRooms != 0 && rooms <= this.numOfRooms && !isSuite){
            bookedRooms = bookedRooms + rooms;
            this.numOfRooms = this.numOfRooms - rooms;
            System.out.println("You have successfully booked " + rooms + " regular rooms.");
            return true;

        }else if(numOfSuites != 0 && rooms <= numOfSuites && isSuite){
            bookedSuites = bookedSuites + rooms;
            numOfSuites = numOfSuites - rooms;
            System.out.println("You have successfully booked " + rooms + " Suites.");
            return true;

        }else{
            System.out.println("No rooms available, get the hell out");
            return false;
        }
    }

    public int getAvailableRooms(){
        return numOfRooms;
    }

    public int getAvailableSuites(){
        return numOfSuites;
    }

}
