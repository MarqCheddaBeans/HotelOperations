package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        double price = 0;
        if (getRoomType().contains("King")){
             price += 139;
        }else{
            price += 124;
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public double getReservationTotal() {

        double total = this.getNumberOfNights() * this.getPrice();

        if(this.isWeekend()){
            total = total + (total * .1);
        }
        return total;
    }

}
