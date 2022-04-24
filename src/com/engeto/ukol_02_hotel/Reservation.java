package com.engeto.ukol_02_hotel;

import java.time.LocalDate;

public class Reservation {
    private int reservationId;
    private Guest guest;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(int reservationId, Guest guest, Room room, LocalDate checkIn, LocalDate checkOut) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getDescription() {
        return  "Číslo rezervace: " + reservationId +"\n"+
                "Host: " + guest +"\n"+
                "Pokoj: " + room +"\n"+
                "Příjezd: " + checkIn +"\n"+
                "Odjezd: " + checkOut;
    }

    public void printDescription() {
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return
                "Číslo rezervace: " + reservationId +"\n"+
                "Host: " + guest +"\n"+
                "Pokoj: " + room +"\n"+
                "Příjezd: " + checkIn +"\n"+
                "Odjezd: " + checkOut;
    }
}
