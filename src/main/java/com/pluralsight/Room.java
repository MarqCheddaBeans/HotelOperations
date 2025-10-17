package com.pluralsight;

public class Room {

    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;
    boolean available;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkIn(){
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true;
            available = false;
            System.out.println("Guest checked in.");
        }else{
            System.out.println("Room is not ready for check in.");
        }
    }
    public void checkOut(){
        if(occupied){
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out. Clean room");
        } else{
            System.out.println("Room is not occupied");
        }
    }
    public void cleanRoom(){
        if(!occupied && dirty){
            dirty = false;
            System.out.println("Room has been cleaned!");
        }else{
            System.out.println("No can do.");
        }
    }



}
