package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;
    private String roomType;

    public Room(String roomType, int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public Room(int numberOfBeds, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty(){
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        if(!isOccupied() && !isDirty()){
            available = true;
            return available;
        }
        return available = false;
    }

    public boolean checkIn(){
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            available = false;
            System.out.println("Guest checked in.");
        }else{
            System.out.println("Room is not ready for check in.");
        }
        return false;
    }
    public boolean checkOut(){
        if(occupied){
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out. Clean room");
        } else{
            System.out.println("Room is not occupied");
        }
        return false;
    }
    public boolean cleanRoom(){
        if(!occupied && dirty){
            dirty = false;
            System.out.println("Room has been cleaned!");
        }else{
            System.out.println("No can do.");
        }
        return false;
    }

}
