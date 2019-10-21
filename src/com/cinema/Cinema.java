package com.cinema;

import java.util.ArrayList;

public class Cinema {
    private String cinemaName;
    private ArrayList<Seat> seats = new ArrayList<Seat>();

    public Cinema(String cinemaName, int numberRow, int seatPerRow){
        this.cinemaName = cinemaName;
        int lastRow = 'A' + numberRow - 1;
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatPerRow; seatNum++){
                Seat seat = new Seat(row+String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public void printCinemaSeat(){
        for (Seat seat:seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = null;
        for (Seat seat:seats) {
            if(seat.getSeatNumber().equals(seatNumber)){
                requestSeat = seat;
                break;
            }
        }
        if(requestSeat==null){
            System.out.println("WARNING: Ghe dat khong ton tai");
            return false;
        }
        return requestSeat.reserve();
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}
